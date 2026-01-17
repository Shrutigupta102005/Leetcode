import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int[] right = new int[n];
        int[] left  = new int[n];

        rightSmaller(heights, right);
        leftSmaller(heights, left);

        int area = 0;

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int curr_area = heights[i] * width;
            area = Math.max(area, curr_area);
        }
        return area;
    }

    // next smaller element index
    public void rightSmaller(int[] heights, int[] right) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
    }

    // previous smaller element index
    public void leftSmaller(int[] heights, int[] left) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
    }
}
