class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<Integer> temp = new ArrayList<>();
        sub(nums,0,temp);
        return ans;
    }
    List<List<Integer>> ans = new ArrayList<>();
    public void sub(int[]nums,int start,List<Integer>temp){
        ans.add(new ArrayList<>(temp));

        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            sub(nums,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}