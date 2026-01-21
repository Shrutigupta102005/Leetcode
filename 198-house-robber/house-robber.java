class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
       return  robb(nums,dp,0);
    }
    public static int robb(int[]nums,int[]dp,int idx){
        if(idx >= nums.length  ){
            return 0 ;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int pick = nums[idx] + robb(nums,dp,idx+2);
        int notpick = robb(nums,dp,idx+1);
        return dp[idx] = Math.max(pick,notpick);
    }
}