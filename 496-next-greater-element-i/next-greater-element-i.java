class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> nge = NGE(nums2);


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], nge.get(i));
        }

        
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
    public static ArrayList<Integer> NGE(int [] arr){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i= 0 ;i<arr.length;i++){
            ans.add(-1);
        }
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>= st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
            ans.set(i,st.peek());
            }
            st.push(arr[i]);
        }
        return ans;
    }
}