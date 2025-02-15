class Solution {
    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canBeSplit(Integer.toString(square), 0, i)) {
                ans += square;
            }
        }
        return ans;
    }

    private boolean canBeSplit(String s, int index, int target) {
        if (index == s.length()) {
            return target == 0;
        }
        int num = 0;
        for (int i = index; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num > target) break;
            if (canBeSplit(s, i + 1, target - num)) {
                return true;
            }
        }
        return false;
    }
}
