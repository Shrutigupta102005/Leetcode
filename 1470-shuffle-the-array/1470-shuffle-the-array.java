class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] rel = new int[nums.length];
        for(int i = 0; i<n;i++){
            
            rel[2 * i] = nums[i];
            rel[2 * i + 1] = nums[i + n]; 
        }
        return rel;
    }
}