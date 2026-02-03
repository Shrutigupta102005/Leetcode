class Solution {
    public int subarraySum(int[] arr, int target) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];     // expanding subarray
                if (sum == target) {
                    count++;
                }
            }
        }
        return count;
    }
}
