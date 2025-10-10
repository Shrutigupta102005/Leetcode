class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(fun(cost, 0, dp), fun(cost, 1, dp));
    }
    public static int fun(int[] cost,int idx ,int[] dp){
        if(idx>= cost.length){
            return 0 ;
        }
        if(dp[idx] !=  -1){
            return dp[idx];
        }
        int f1 = cost[idx] + fun(cost ,idx+1 ,dp); 
        int f2 = cost[idx] + fun(cost ,idx+2 ,dp); 
        return dp[idx] = Math.min(f1,f2);
    }

}