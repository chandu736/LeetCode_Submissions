class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        int n=nums.length;
        long count=n;
        int curr=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                curr++;
            }else{
                curr=0;
            }
            count+=curr;
        }
        return count;
    }
}