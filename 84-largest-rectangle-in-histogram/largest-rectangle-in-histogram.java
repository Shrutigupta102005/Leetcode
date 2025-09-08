class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : heights[i]); 
            while (!st.isEmpty() && heights[st.peek()] > h) {
                int height = heights[st.pop()];
                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();
                int width = right - left - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        return maxArea;
    }
}
