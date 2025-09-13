class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void reverse( int[] arr ,int l , int r){
        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp ;
            r--;
            l++;
        }
    }
}