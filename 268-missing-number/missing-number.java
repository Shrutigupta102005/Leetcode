class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length;
        int arrs = 0;
        for(int i = 0 ;i < nums.length;i++){
            sum += i;
            arrs += nums[i];
        }
        return sum - arrs;
    }
}