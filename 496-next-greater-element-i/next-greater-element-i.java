class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int [] res = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[nums2.length];
        for(int i = nums2.length-1 ;i>=0;i--){
            while(!st.isEmpty() && st.peek()<= nums2[i] ){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
        }
        for(int j = 0 ;j< nums1.length ;j++){
            for(int k = 0 ;k<nums2.length ;k++){
                if(nums1[j] == nums2[k]){
                    res[j] = ans[k];
                }
            }
        }
        return res;
    }
}