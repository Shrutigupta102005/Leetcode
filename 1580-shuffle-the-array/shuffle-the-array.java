class Solution {
    public int[] shuffle(int[] nums, int n) {
        int idx =  0;
        int[] ans = new int[nums.length];
        for(int i = 0;i<n;i++){
        ans[idx++] = nums[i];
        
        ans[idx++] = nums[i+n]; 
        
        }
        return ans;
    }
}