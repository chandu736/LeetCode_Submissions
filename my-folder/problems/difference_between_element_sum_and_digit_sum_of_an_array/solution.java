class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,digSum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(nums[i]>0){
                int dig=nums[i]%10;
                digSum+=dig;
                nums[i]=nums[i]/10;
            }
        }
        return Math.abs(sum-digSum);
    }
}