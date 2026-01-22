class Solution {
    public int rob(int[] nums) {
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        int m1 = robb(nums,dp1,0,nums.length-2);
        int m2 = robb(nums,dp2,1,nums.length-1);
        return Math.max(m1,m2);
    }
    public int robb(int[]num ,int[]dp,int idx,int end){     
        if (num.length == 1) return num[0];
        if(idx > end){
            return 0 ;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int pick = num[idx] + robb(num,dp,idx+2,end);
        int notpick = robb(num,dp,idx+1,end);
        return dp[idx] = Math.max(pick,notpick);  
    }
}