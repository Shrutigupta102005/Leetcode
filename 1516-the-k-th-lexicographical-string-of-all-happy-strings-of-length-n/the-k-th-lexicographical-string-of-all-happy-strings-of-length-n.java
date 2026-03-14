class Solution {
    public String getHappyString(int n, int k) {
        int sz = 3 * (1 << (n - 1));
        if (k > sz) return "";

        int base = 1 << (n - 1);
        int q = (k - 1) / base;
        int r = (k - 1) % base;

        char[] s = new char[n];
        s[0] = (char)('a' + q);

        char[][] xx = {
            {'b', 'c'},
            {'a', 'c'},
            {'a', 'b'}
        };

        for (int i = n - 2; i >= 0; i--) {
            int idx = s[n - 2 - i] - 'a';
            int bit = (r >> i) & 1;
            s[n - 1 - i] = xx[idx][bit];
        }

        return new String(s);
    }
}