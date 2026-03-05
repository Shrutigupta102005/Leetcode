class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();
        perm(nums,temp,used);
        return ans;
    }
    List<List<Integer>> ans = new ArrayList<>();
    public void perm(int[]nums , List<Integer>temp, boolean [] used){
        
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0 ;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            if(used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);
            perm(nums,temp,used);
            temp.remove(temp.size() -1);
            used[i] = false;
        }
    }
}