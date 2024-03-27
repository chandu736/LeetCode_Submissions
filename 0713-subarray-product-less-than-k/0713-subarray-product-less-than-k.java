class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int prod = 1;
        int count = 0;
        int left = 0;
        for(int right = 0; right <n; right++) {
            prod *= nums[right];
            while(prod >= k && left <= right) {
                prod /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}