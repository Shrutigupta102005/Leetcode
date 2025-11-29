class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = 0 ;
        int n = nums.length;
        for(int i = 0 ; i< n ;i++){
            ans += nums[i];
        }
        return ans % k;
    }
}