class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> ans = new ArrayList<>();
     combsum(candidates,target,0,new ArrayList<>(),ans);
     return ans;
    }
    public static void combsum(int[] can, int target, int idx ,List<Integer> curr, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx;i<can.length;i++){
            if(can[i]<= target){
                curr.add(can[i]); 
                combsum(can,target-can[i],i,curr,ans);
                curr.remove(curr.size() - 1); // backtrack

            }
        }
    }
}