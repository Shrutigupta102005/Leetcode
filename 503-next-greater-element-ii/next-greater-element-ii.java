class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>(); 

        
        for (int i = 2 * n - 1; i >= 0; i--) {

            int idx = i % n;

            while (!st.isEmpty() && nums[st.peek()] <= nums[idx]) {
                st.pop();
            }

            if (i < n) { 
                if (!st.isEmpty()) {
                    ans[idx] = nums[st.peek()];
                }
            }

            st.push(idx);
        }

        return ans;
    }
}
