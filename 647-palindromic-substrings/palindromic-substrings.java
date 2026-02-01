class Solution {
    int count = 0;

    public int countSubstrings(String s) {
        if (s.length() == 0) return 0;

        for (int i = 0; i < s.length(); i++) {
            pali(s, i, i);     // odd length
            pali(s, i, i + 1); // even length
        }
        return count;
    }

    public void pali(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }
    }
}
