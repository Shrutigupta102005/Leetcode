class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        int sum = 0;
        for(int i = 0 ; i< accounts.length ;i++){
            for(int j = 0 ; j<accounts[0].length ;j++){
                sum = sum + accounts[i][j];
            }
            ans = Math.max(sum ,ans);
            sum =0;
        }
        return ans;
    }
}