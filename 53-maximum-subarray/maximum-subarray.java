class Solution {
    public int maxSubArray(int[] nums) {
        int cursum =  nums[0];
        int maxsum =  nums[0];
        for(int  i =  1 ;i< nums.length;i++){
            cursum = Math.max(nums[i],cursum+nums[i]);
            maxsum = Math.max(maxsum , cursum);
        }
        return maxsum;
    }
}