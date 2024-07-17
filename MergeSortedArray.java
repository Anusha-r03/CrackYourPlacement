class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        long[] arr3 = new long[n + m];
        int left = 0;
        int right = 0;
        int index = 0;
        
        // Merge arrays
        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                arr3[index] = nums1[left];
                left++;
            } else {
                arr3[index] = nums2[right];
                right++;
            }
            index++;
        }
        
        // Copy remaining elements from nums1
        while (left < m) {
            arr3[index++] = nums1[left++];
        }
        
        // Copy remaining elements from nums2
        while (right < n) {
            arr3[index++] = nums2[right++];
        }
        
        // Copy merged array back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = (int) arr3[i];
        }
    }
}
