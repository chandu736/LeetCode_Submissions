class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=0;
        int maxSum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                sum+=nums[i];
            }else{
                sum+=nums[i];
                maxSum=Math.max(maxSum,sum);
                sum=0;
            }
        }
        sum+=nums[nums.length-1];
        maxSum=Math.max(sum,maxSum);
        return maxSum;
    }
}