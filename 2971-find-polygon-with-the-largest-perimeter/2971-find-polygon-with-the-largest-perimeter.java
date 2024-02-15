class Solution {
    public long largestPerimeter(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        long sum=0;
        for(int i:nums){
            sum+=i;
        }
        int count=n;
        for(int i=n-1;i>=0;i--){
            long checkSum=sum-nums[i];
            if(nums[i]<checkSum && count>=3){
                return sum;
            }
            sum-=nums[i];
            count--;
        }
        return -1;
    }
}