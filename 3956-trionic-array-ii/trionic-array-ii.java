class Solution {
    long NEG = -100000000000000L;

    public long maxSumTrionic(int[] nums) {
        int n = nums.length;
        Long[][] dp = new Long[n + 1][4];

        for (int s = 0; s < 4; s++) {
            dp[n][s] = (s == 3) ? 0L : NEG;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int s = 0; s < 4; s++) {
                long take = NEG;
                long notTake = NEG;

                if (s == 0) {
                    notTake = dp[i + 1][0];
                }

                if (s == 3) {
                    take = nums[i];
                }

                if (i + 1 < n) {
                    if (s == 0 && nums[i + 1] > nums[i]) {
                        take = Math.max(take, nums[i] + dp[i + 1][1]);
                    } 
                    else if (s == 1) {
                        if (nums[i + 1] > nums[i]) {
                            take = Math.max(take, nums[i] + dp[i + 1][1]);
                        } else if (nums[i + 1] < nums[i]) {
                            take = Math.max(take, nums[i] + dp[i + 1][2]);
                        }
                    } 
                    else if (s == 2) {
                        if (nums[i + 1] < nums[i]) {
                            take = Math.max(take, nums[i] + dp[i + 1][2]);
                        } else if (nums[i + 1] > nums[i]) {
                            take = Math.max(take, nums[i] + dp[i + 1][3]);
                        }
                    } 
                    else if (s == 3 && nums[i + 1] > nums[i]) {
                        take = Math.max(take, nums[i] + dp[i + 1][3]);
                    }
                }

                dp[i][s] = Math.max(take, notTake);
            }
        }

        return dp[0][0];
    }
}