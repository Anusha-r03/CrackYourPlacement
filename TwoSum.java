class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int rem = target-num;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==rem){
                    return new int[] {i,j};
                }   
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
