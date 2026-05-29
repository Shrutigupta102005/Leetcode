class Solution {
    public int maxArea(int[] height) {
        int s =  0;
        int e = height.length-1;
        int maxArea = 0 ;
        while(s<e){
            int b = e-s;
            int l = Math.min(height[s] ,height[e]);
            int temp  = l*b;
            maxArea = Math.max(temp, maxArea);
            if(height[s] >height[e]){
                e--;
            }else{
                s++;
            }
        }
        return maxArea;
    }
}