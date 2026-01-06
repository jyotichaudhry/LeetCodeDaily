class Solution {
    public int longestConsecutive(int[] nums) {
    
        int maxLen = 0;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int ele:nums){
        set.add(ele);
      } 
         for(int ele:set){ 
            int currLen = 0;
       
            if(!set.contains(ele-1)){
        while(set.contains(ele)) {
                ele += 1;
                currLen += 1;
            }
            }
            maxLen = Math.max(currLen, maxLen);
        }
        return maxLen;
    }
}