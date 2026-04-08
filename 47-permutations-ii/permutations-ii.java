class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        boolean [] used = new boolean[nums.length];
        per(nums,used,temp);
        return ans;
    }
     List<List<Integer>> ans = new ArrayList<>();
    public void per(int[] nums,boolean[] used , List<Integer>temp){
        if(nums.length == temp.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0 ;i<nums.length;i++){
            if(i> 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            if(used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);
            per(nums,used,temp);
            temp.remove(temp.size() -1);
            used[i] =false;
        }
    }
}