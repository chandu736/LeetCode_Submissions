class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;

        for (int start = 0; start < n; start++) {
            int orResult = 0;
            for (int end = start; end < n; end++) {
                orResult |= nums[end];
                if (orResult >= k) {
                    minLen = Math.min(minLen, end - start + 1);
                    break;
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}