class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        dp[0][0]=matrix[0][0];
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j],
                Math.min((j>0)?dp[i-1][j-1]:Integer.MAX_VALUE,
                (j<n-1)?dp[i-1][j+1]:Integer.MAX_VALUE));
            }
        }
        int minSum=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            minSum=Math.min(minSum,dp[m-1][j]);
        }
        return minSum;
    }
}