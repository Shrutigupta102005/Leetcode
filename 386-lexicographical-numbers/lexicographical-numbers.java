class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        order(n, 0, ans);
        return ans;
    }

    private void order(int n, int curr, List<Integer> ans) {
        if (curr > n) return;

        if (curr != 0) ans.add(curr); // avoid adding 0

        int i = (curr == 0) ? 1 : 0; // if curr=0 start from 1
        for (; i <= 9; i++) {
            if (curr * 10 + i > n) return;
            order(n, curr * 10 + i, ans);
        }
    }
}
