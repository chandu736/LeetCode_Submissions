class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
    private static int helper(int[] nums, int goal){
        if(goal<0) return 0;
        int count=0;
        int left=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left++];
            }
            count+=right-left+1;
        }
        return count;
    }
}