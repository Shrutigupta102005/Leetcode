class Solution {
    public int addDigits(int num) {
        while (num >= 10) { // Keep summing until we get a single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum; // Update num to new sum
        }
        return num; // Return the single-digit sum
    }
}
