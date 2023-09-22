class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int target=total-x;
        int left=0;
        int maxLength=-1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>target && left<=i){
                sum-=nums[left];
                left++;
            }
            if(sum==target){
                maxLength=Math.max(maxLength,i-left+1);
            }
        }
        return maxLength!=-1?nums.length-maxLength:-1;
    }
}