class Solution {
    private boolean validate(int ver, int[][] graph,boolean[] validate, boolean[] visited){
        if(graph[ver].length == 0){
            validate[ver] = true;
            return true;
        }
        if(validate[ver] == true){
            return true;
        }
        if(visited[ver]){
            return false;
        }

        visited[ver] = true;
        boolean flag = true;
        for(int edg : graph[ver]){
            flag = validate(edg, graph, validate, visited);
            if(!flag){
                validate[ver] = false;
                return false;
            }
        }
        visited[ver] = false;
        validate[ver] = true;
        return true;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        boolean[] valid = new boolean[n];
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            validate(i, graph, valid,visited);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(valid[i]){
                ans.add(i);
            }
        }

        return ans;
    }
}