class Solution {
    public int trap(int[] height) {
        // aprach --> left max , right max , area calculate karna hai
        int n = height.length;
        int [] left = new int[n];
        left[0]=height[0];
        for(int i =1;i<left.length;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }
        int [] right = new int [n];
        right[n-1] =height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],height[i]);
        }

        int sum = 0;
        for(int i =0;i<n;i++){
            sum =sum +((Math.min(left[i],right[i]))-height[i]);
        }
        return sum;
    }
}