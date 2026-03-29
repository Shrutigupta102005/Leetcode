class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if((nums[i] == 1 && nums[j] == 2) || 
                   (nums[i] == 2 && nums[j] == 1)){
                    ans = Math.min(ans,Math.abs(i-j));
                }
            }
        }
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}