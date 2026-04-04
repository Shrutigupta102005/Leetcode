class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];

        ans[0] = fo(nums, target, 0);
        ans[1] = lo(nums, target, nums.length - 1);

        return ans;
    }

    public int fo(int[] nums, int target, int idx) {
        if (idx == nums.length) return -1;

        if (nums[idx] == target) return idx;

        return fo(nums, target, idx + 1);
    }

    public int lo(int[] nums, int target, int idx) {
        if (idx < 0) return -1;

        if (nums[idx] == target) return idx;

        return lo(nums, target, idx - 1);
    }
}