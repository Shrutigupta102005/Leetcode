class Solution {
    public int rob(int[] nums) {
        int [] dp1 = new int[nums.length];
        int [] dp2 = new int[nums.length]; 
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int c1 = house(nums,0,nums.length-2,dp1);
        int c2 = house(nums,1,nums.length-1,dp2);
        return Math.max(c1,c2);
    }
    public static int house(int[] nums, int idx,int end,int [] dp){
            if (nums.length == 1) return nums[0];

            if(idx >end){return 0;}
            if(dp[idx] != -1){
                return dp[idx];
            }
            int f1 = nums[idx]+house(nums,idx+2,end,dp);
            int f2 = house(nums,idx+1,end,dp);
            return dp[idx] = Math.max(f1,f2);
    }
}