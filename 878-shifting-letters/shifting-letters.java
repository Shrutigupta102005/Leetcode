class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long maxi = 0;
        char[] chars = s.toCharArray();
        for (int i = shifts.length - 1; i >= 0; i--) {
            maxi += shifts[i];
            chars[i] = (char) ('a' + (chars[i] - 'a' + maxi) % 26);
        }
        return new String(chars);
    }
}