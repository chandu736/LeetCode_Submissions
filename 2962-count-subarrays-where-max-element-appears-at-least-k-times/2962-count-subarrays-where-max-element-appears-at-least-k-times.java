class Solution {
    public long countSubarrays(int[] nums, int k) {
        long count=0;
        int left=0;
        int right=0;
        int max=maxElement(nums);
        int n=nums.length;
        while(right<n){
            k-=nums[right]==max?1:0;
            right++;
            while(k==0){
                k+=nums[left]==max?1:0;
                left++;
            }
            count+=left;
        }
        return count;
    }
    private int maxElement(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
        }
        return max;
    }
}