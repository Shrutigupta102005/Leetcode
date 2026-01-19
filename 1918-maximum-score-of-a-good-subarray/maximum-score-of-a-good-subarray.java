class Solution {
    public int maximumScore(int[] nums, int k) {
        int l = k , r = k;
        int min = nums[k];
        int ans = min;
        while(l>0 || r<nums.length-1){
            if(l == 0){
                r++;
            }else if(r == nums.length-1 ){
                l--;
            }else if(nums[l-1]>nums[r+1]){
                l--;
            }else{
                r++;
            }
            min = Math.min(min, Math.min(nums[l], nums[r]));
            ans = Math.max(ans, min * (r - l + 1));
        }
        return ans ;
    }
}