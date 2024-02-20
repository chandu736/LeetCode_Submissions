class Solution {
    int[][]dp;
    public int maxOperations(int[] nums) {
        int n=nums.length;
        dp=new int[n][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int res=0;
        res=Math.max(res, 1+helper(2,n-1,nums,nums[0]+nums[1]));
        res=Math.max(res, 1+helper(0,n-3,nums,nums[n-1]+nums[n-2]));
        res=Math.max(res, 1+helper(1,n-2,nums,nums[0]+nums[n-1]));
        return res;
    }
    private int helper(int l,int r,int[] nums,int num){
        if(l>=r) return 0;
        if(dp[l][r]!=-1) return dp[l][r];

        int res=0;
        if(nums[l]+nums[l+1]==num){
            res=Math.max(res, 1+helper(l+2,r,nums,num));
        }
        if(nums[r]+nums[r-1]==num){
            res=Math.max(res, 1+helper(l,r-2,nums,num));
        }
        if(nums[l]+nums[r]==num){
            res=Math.max(res, 1+helper(l+1,r-1,nums,num));
        }
        return dp[l][r]=res;
    }
}