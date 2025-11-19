class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++) {
            if (edges[i] != -1) indegree[edges[i]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] removed = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        // Topological pruning
        while (!q.isEmpty()) {
            int node = q.poll();
            removed[node] = true;

            int nxt = edges[node];
            if (nxt != -1) {
                indegree[nxt]--;
                if (indegree[nxt] == 0) q.add(nxt);
            }
        }

        int ans = -1;
        boolean[] seen = new boolean[n];

        // Now count cycle length
        for (int i = 0; i < n; i++) {
            if (!removed[i] && !seen[i]) {
                int curr = i;
                int count = 0;

                // mark the start time to detect cycle length
                HashMap<Integer, Integer> time = new HashMap<>();
                int t = 0;

                while (curr != -1 && !removed[curr] && !time.containsKey(curr)) {
                    time.put(curr, t++);
                    seen[curr] = true;
                    curr = edges[curr];
                }

                // cycle found
                if (curr != -1 && time.containsKey(curr)) {
                    ans = Math.max(ans, t - time.get(curr));
                }
            }
        }
        return ans;
    }
}
