class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int dip = n-2;
        while(dip>=0 && nums[dip] >= nums[dip+1]){
            dip--;
        }

         if (dip >= 0) {
            int justGreater = n - 1;
            while (nums[justGreater] <= nums[dip]) {
                justGreater--;
            }
            swap(nums, dip, justGreater);
        }
        reverse(nums,dip+1,n-1);

    }
    public static void reverse(int[]nums,int start ,int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp ;
            start++;
            end--;
        }
    }

    public static void swap(int[]nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}