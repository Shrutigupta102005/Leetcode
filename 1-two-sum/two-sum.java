class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        
        for(int j =0 ;j<nums.length;j++){
        for(int i =j+1 ; i<nums.length;i++ ){
            if(nums[j] + nums[i] == target){
                ans[0] = j ;
                ans[1] =  i;
                return ans;
            }
        }
        }
        return ans ;
    }
}