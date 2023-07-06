class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        int left=0;
        int sum=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                sum-=nums[left];
                ans=Math.min(ans,right-left+1);
                left++;
            }
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}