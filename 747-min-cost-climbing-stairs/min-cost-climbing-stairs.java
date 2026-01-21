class Solution {
    public int minCostClimbingStairs(int[] cost) {  
        int[] dp1 = new int[cost.length];
        Arrays.fill(dp1,-1);
        int[] dp2 = new int[cost.length];
        Arrays.fill(dp2,-1);
         int m1 = mincost(cost,dp1,0);
         int m2 = mincost(cost,dp2,1);
        return Math.min(m1,m2);
    }
    public int mincost(int[] cost , int[] dp ,int idx){
        if(idx >= cost.length){
            return 0 ;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int pick = cost[idx] + mincost(cost ,dp,idx+1);
        int notpick = cost[idx] + mincost(cost ,dp,idx+2);
        return dp[idx] = Math.min(pick,notpick);
    }
}