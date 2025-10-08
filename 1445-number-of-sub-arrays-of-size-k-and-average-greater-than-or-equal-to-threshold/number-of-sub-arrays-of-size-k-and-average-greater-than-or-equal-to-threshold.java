class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ws = 0 ;
        int count = 0;
        for(int i = 0 ; i<k;i++){
            ws += arr[i];
        }
        int avg = ws/k;
        if(avg >= threshold){
                count++;
            }
        for(int i = k;i<arr.length;i++){
            
            ws += arr[i] - arr[i-k];
            avg = ws/k;
            if(avg >= threshold){
                count++;
            }
        }
        return count;
    }
}