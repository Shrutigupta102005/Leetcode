class Solution {
    public int findGCD(int[] nums) {
        int sn = Integer.MAX_VALUE;
        int ln = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            ln = Math.max(ln, nums[i]);
            sn = Math.min(sn, nums[i]);
        }

        return gcd(ln, sn);
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
