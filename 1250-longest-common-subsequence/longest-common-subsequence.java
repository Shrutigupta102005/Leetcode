class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return lcs(text1,text2,0,0,dp);
    }
    public int lcs(String text1, String text2 , int i , int j ,int[][] dp) {
        if(i == text1.length() || j == text2.length()){
            return 0 ;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = 0 ;
        if(text1.charAt(i) == text2.charAt(j)){
            ans = 1+ lcs(text1,text2,i+1,j+1,dp);
        }else{
            int f1 =  lcs(text1,text2,i,j+1,dp);
            int f2 = lcs(text1,text2,i+1,j,dp);
            ans = Math.max(f1,f2);
        }

        return dp[i][j] = ans;
    }
    
}