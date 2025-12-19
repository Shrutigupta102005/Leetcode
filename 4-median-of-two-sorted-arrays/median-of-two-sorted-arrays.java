class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i =0  ; 
        int j = 0 ; 
        int k = 0  ;
        int[] com = new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j]){
                com[k++] = nums1[i++];
            }else{  
                com[k++] = nums2[j++];
            }
        }

        while(i<nums1.length){
            com[k++] = nums1[i++]; 
        }
        while(j<nums2.length){
            com[k++] = nums2[j++];
        }
        int mid = com.length/2;
        if(com.length%2!=0){
            return (double)com[mid];
        }else{
           double ans =  (com[mid]+com[mid-1])/2.0;
            return ans ;
        }
    }
}