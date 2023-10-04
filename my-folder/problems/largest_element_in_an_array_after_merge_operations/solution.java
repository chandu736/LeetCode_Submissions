class Solution {
    public long maxArrayValue(int[] nums) {
        int n=nums.length;
        long sum=nums[n-1];
        for(int i=n-2;i>=0;i--){
            int value=nums[i];
            if(sum>=value){
                sum+=value;
            }else{
                sum=value;
            }
        }
        return sum;
    }
}