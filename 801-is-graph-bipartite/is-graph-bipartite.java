class Solution {
    class bipart_pair{
        int vtx;
        int dis;

        public bipart_pair(int vtx,int dis){
            this.vtx = vtx;
            this.dis = dis;
        }
    }
    public boolean isBipartite(int[][] graph) {
        Queue<bipart_pair> q = new LinkedList<>();
        HashMap<Integer,Integer> visited = new HashMap<>();
        for(int key = 0 ; key < graph.length ; key++){
            if(visited.containsKey(key)){
                continue;
            }
            q.add(new bipart_pair(key,0));
            while(!q.isEmpty()){
                // remove
                bipart_pair rv = q.poll();
                // ignore 
                if(visited.containsKey(rv.vtx)){
                    if(visited.get(rv.vtx) != rv.dis){
                        return false;
                    }
                    continue;
                }
                // mark visited 
                visited.put(rv.vtx,rv.dis);
                // self work


                // mark unvisited
                for(int nbrs:graph[rv.vtx]){
                    if(!visited.containsKey(nbrs)){
                        q.add(new  bipart_pair(nbrs,rv.dis+1) );
                    }
                }
                
            }
        }
        return true;
    }
}