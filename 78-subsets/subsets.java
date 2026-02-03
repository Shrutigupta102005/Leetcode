class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    public void subset(int[]nums , int idx ,List<Integer> temp,List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        
        subset(nums,idx+1,temp,ans);
        temp.add(nums[idx]);
        subset(nums,idx+1,temp,ans);
        temp.remove(temp.size() - 1);
    }
}