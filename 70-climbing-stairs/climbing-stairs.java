class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return fibo(n,dp);
    }
    public static int fibo(int n , int[] dp){
        if(n<=2){return n;}
        if(dp[n] != 0){
            return dp[n];
        }
        int f1 = fibo(n-1,dp);
        int f2 = fibo(n-2,dp);
        return dp[n] =f1+f2;
    }
}