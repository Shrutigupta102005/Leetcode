import java.util.*;

class Solution {
    HashMap<Integer, List<Integer>> map = new HashMap<>();

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            map.get(u).add(v);
            map.get(v).add(u); 
        }


        HashSet<Integer> visited = new HashSet<>();
        return hasPath(source, destination, visited);
    }

    public boolean hasPath(int src, int dest, HashSet<Integer> visited) {
        if (src == dest) return true;

        visited.add(src);

        for (int neighbor : map.get(src)) {
            if (!visited.contains(neighbor)) {
                boolean ans = hasPath(neighbor, dest, visited);
                if (ans) return true;
            }
        }
        return false;
    }
}
