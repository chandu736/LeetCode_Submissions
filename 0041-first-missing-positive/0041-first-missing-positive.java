class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int j=n;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] <= 0) {
                int temp = nums[i];
                nums[i] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
        for (int i = 0; i < j; i++) {
            int num = Math.abs(nums[i]);
            if (num > 0 && num <= j) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < j; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return j+1;
    }
}