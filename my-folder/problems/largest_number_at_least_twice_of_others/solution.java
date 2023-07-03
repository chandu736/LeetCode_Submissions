class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int index=0;
        for(int i=0; i<n; i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        Arrays.sort(nums);
        if(nums[n-1] >= 2*nums[n-2]){
            return index;
        }
        return -1;
    }
}