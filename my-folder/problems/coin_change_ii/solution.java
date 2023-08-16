class Solution {
    public int change(int amount, int[] coins) {
        int[] dp=new int[amount+1];
        dp[0]=1;
        int coin;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                coin=coins[i];
                dp[j]=dp[j]+dp[j-coin];
            }
        }
        return dp[amount];
    }
}