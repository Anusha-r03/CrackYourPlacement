class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j =1;
        for( int i=1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

// public class RemoveDuplicate {
//     public static void main(String[] args) {
//         Solution solution = new Solution();

//         int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//         int length = solution.removeDuplicates(nums);

//         System.out.println("The length of the array after removing duplicates is: " + length);
//         System.out.print("The modified array is: ");
//         for (int i = 0; i < length; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }
