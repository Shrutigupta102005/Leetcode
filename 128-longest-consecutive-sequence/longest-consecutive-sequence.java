class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int curr = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            }

            if (nums[i] == nums[i - 1] + 1) {
                curr++;
            } else {
                curr = 1; // reset streak
            }

            max = Math.max(max, curr);
        }

        return max;
    }
}
