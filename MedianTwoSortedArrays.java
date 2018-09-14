class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalItems = nums1.length + nums2.length;
        int[] combined = new int[totalItems];
        
        int p1 = 0;
        int p2 = 0;
        
        for (int i = 0; i < totalItems; i++) {
            if (p1 < nums1.length && p2 < nums2.length) {
                if (nums1[p1] <= nums2[p2]) {
                    combined[i] = nums1[p1];
                    p1++;
                } else {
                    combined[i] = nums2[p2];
                    p2++;
                }
            } else if (p1 < nums1.length && p2 > nums2.length - 2) {
                combined[i] = nums1[p1];
                p1++;
            } else if (p1 > nums1.length -2 && p2 < nums2.length) {
                combined[i] = nums2[p2];
                p2++;
            }
            }
                       
        return getMedian(combined, totalItems);
        
    }
    
    private double getMedian(int[] numSet, int items) {
        if (items % 2 != 0) {
            double median = (double) numSet[items / 2];
            return median;
        } else {
            double median = (double) (numSet[items / 2] + numSet[(items / 2) - 1]) / 2;
            return median;
        }
    }
}