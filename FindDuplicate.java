class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            
            // Count how many numbers are less than or equal to mid
            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }
            
            // If count is more than mid, the duplicate is in the lower half
            if (count > mid) {
                high = mid;
            } else { // Otherwise, it's in the upper half
                low = mid + 1;
            }
        }
        
        return low;
    }
}