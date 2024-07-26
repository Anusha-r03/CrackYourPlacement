// 75. Sort Colors

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]

class Solution {
    public void sortColors(int[] nums) {
        int i, r=0, w=0, b=0;
        for(i=0; i< nums.length; i++){
            if(nums[i] == 0)
                r++;
            else if(nums[i] == 1)
                w++;
            else if( nums[i] == 2)
                b++;
        }
        for(i=0; i<nums.length;i++){
            if(i<r)
                nums[i] = 0;
            else if (i < r+w) 
                nums[i] = 1;
            else if (i < r+w+b) 
                nums[i] = 2;
        }
    }
}