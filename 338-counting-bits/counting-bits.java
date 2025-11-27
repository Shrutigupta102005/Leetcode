class Solution {
    public int[] countBits(int n) {
        int [] ans = new int[n+1];
        for(int i=0;i<n+1;i++){
            ans [i] = cs(i);
        }
        return ans;
    }
    public static int cs(int n){
        int ans = 0;
        while(n >0){
            ans++;
            n =n &(n-1);
        }
        return ans;
    }
}