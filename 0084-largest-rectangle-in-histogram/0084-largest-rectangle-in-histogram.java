class Solution {
    public int largestRectangleArea(int[] heights) {
        return find_largest_rectangle(heights);
    }
    public static int find_largest_rectangle(int arr[]){
        int area=0;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    area=Math.max(area,h*r);
                }else{
                    int l=st.peek();
                    area=Math.max(area,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while(!st.isEmpty()){
            int h=arr[st.pop()];
            if(st.isEmpty()){
                area=Math.max(area,h*r);
            }else{
                int l=st.peek();
                area=Math.max(area,h*(r-l-1));
            }
        }
        return area;

    }
}