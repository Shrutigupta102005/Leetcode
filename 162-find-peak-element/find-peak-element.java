class Solution {
    public int findPeakElement(int[] nums) {
        int ans = nums[0];
        int idx=0;
        for(int i = 1 ; i< nums.length; i++){
            if(ans<nums[i]){
                ans = nums[i];
                 idx= i;
            }
           
        }
        return idx;
    }
}