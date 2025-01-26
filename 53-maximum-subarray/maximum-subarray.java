class Solution {
    public int maxSubArray(int[] nums) {
        int  currSum = nums[0] ;
       int largestSum = Math.max(currSum, Integer.MIN_VALUE);
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i],nums[i]+currSum);
            largestSum = Math.max(currSum, largestSum);
        }
       
       return largestSum;
    }
}