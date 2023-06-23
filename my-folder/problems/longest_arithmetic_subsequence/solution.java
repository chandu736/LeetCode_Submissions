class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>[] dp=new HashMap[n];
        int longest=2;
        for(int j=0;j<n;j++){
            dp[j]=new HashMap<>();
            for(int i=0;i<j;i++){
                int diff=nums[j]-nums[i];
                dp[j].put(diff,dp[i].getOrDefault(diff,1)+1);
                longest=Math.max(longest,dp[j].get(diff));
            }
        }
        return longest;
    }
}