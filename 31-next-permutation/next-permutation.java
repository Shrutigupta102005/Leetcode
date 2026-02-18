class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length ;
        int pivot = -1;
        for(int i= n - 1;i>0;i--){
            if(nums[i] > nums[i-1]){
                pivot = i-1;
                break ;
            }
        }

        // pivot ka next greater element ;
        if (pivot != -1) {
            int swap_index= pivot;

            for (int j = n - 1; j >= pivot + 1; j--) {
                if (nums[j] > nums[pivot]) {
                    swap_index = j;
                    break;
                }
            }

            swap(nums, pivot, swap_index);
        }
        
        reverse(nums,pivot+1,n-1);
    }

    public static void swap(int[] nums,int a ,int b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
    }
    public static void reverse(int[] nums,int i , int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp ;
            i++;
            j--;
        }
    }
}