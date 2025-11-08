class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        double ws =0 ;
        for(int i =0 ;i<k;i++){
            ws += nums[i];
        }
        ans = ws;
        for(int i = k ;i<nums.length;i++){
            ws = ws + nums[i] - nums[i-k];
             ans = Math.max(ans,ws);
        }
       
        return ans/k;
    }
}