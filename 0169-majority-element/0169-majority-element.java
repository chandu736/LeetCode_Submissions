class Solution {
    public int majorityElement(int[] nums) {
        int num=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                num=nums[i];
                count=1;
            }else if(nums[i]==num){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int i:nums){
            if(i==num) count++;
        }
        if(count>nums.length/2) return num;
        else return 0;
    }
}