class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=nums[0],max=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int diff= (max-k)-(min+k);
        return (diff>0)?diff:0;
    }
}