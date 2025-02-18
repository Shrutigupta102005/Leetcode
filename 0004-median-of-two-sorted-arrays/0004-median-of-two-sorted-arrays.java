class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++) {
            merge[i] = nums1[i];
        }
        for(int i = nums1.length, j = 0; i < merge.length; i++) {
            merge[i] = nums2[j];
            j++;
        }
        Arrays.sort(merge);
        double median;
        int n = merge.length;
        if(n % 2 != 0) {
            median =(double) merge[((n+1)/2) - 1];
        }else {
            int a = merge[n/2 - 1];
            int b = merge[n/2];
            median = (double) (a+b)/2;
        }
        return median;
    }
}