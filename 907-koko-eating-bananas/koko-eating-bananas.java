class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1; // speed kam se kam 1 hogi
        int e = max(piles);
        int ans = e;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (canEatAll(piles, m, h)) {
                ans = m;
                e = m - 1; // aur kam speed try karo
            } else {
                s = m + 1; // speed badhni padegi
            }
        }
        return ans;
    }

    private int max(int[] piles) {
        int ans = piles[0];
        for (int p : piles) {
            ans = Math.max(ans, p);
        }
        return ans;
    }

    private boolean canEatAll(int[] piles, int k, int h) {
        int hourspent = 0;
        for (int p : piles) {
            hourspent += (p + k - 1) / k; // ceiling division
            if (hourspent > h) return false;
        }
        return true;
    }
}
