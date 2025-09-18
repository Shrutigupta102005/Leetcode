class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};
        ans[0] = firstoccur(nums,target);
        ans[1] = Lastoccur(nums,target);
        return ans;
    }
    public static int firstoccur(int[] nums, int target){
        int s = 0 ;
        int e = nums.length -1;
        int res = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                res = m;
                e = m-1;
            }else if(nums[m] > target){
                    e =m-1;
            }else{
                s = m+1;
            }
        }
        return res ;
    }

    public static int Lastoccur(int[] nums, int target){
        int s = 0 ;
        int e = nums.length -1;
        int res = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                res = m;
                s = m+1;
            }else if(nums[m] > target){
                    e =m-1;
            }else{
                s = m+1;
            }
        }
        return res ;
    }

}