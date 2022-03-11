
https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        
        int outputIndex =0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[outputIndex] = nums[i];
                outputIndex++;
        }
        
        for(int i = outputIndex; i<nums.length; i++){
            nums[i]=0;
        }
    }
}
