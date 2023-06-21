class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int step=0;
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                step+=Math.abs(nums[i]-nums[i-1])+1;
                nums[i]=nums[i-1]+1;
            }
        }
        return step;
    }
}