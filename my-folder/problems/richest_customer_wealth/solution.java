class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int n=accounts.length;
        for(int i=0;i<n;i++){
            int maxSum=0;
            for(int j=0;j<accounts[i].length;j++){
                maxSum+=accounts[i][j];
            }
            if(maxSum>sum) sum=maxSum;
        }
        return sum;
    }
}