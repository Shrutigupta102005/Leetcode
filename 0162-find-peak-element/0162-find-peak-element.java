class Solution {
    public int findPeakElement(int[] nums) {
        int ans = nums[0];
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(ans<nums[i]){
                ans =nums[i];
                index = i;
            }
        }
        return index ;
    }
}