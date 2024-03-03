class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int zeroCount=0;
        while(end<nums.length){
            if(nums[end]==0){
                zeroCount++;
            }
            end++;
            if(zeroCount>k){
                if(nums[start]==0){
                    zeroCount--;
                }
                start++;
            }
        }
        return end-start;
    }
}