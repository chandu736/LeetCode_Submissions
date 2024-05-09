class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res=0;
        int n=happiness.length;
        int j=0;
        int value=0;
        for(int i=n-1;i>=n-k;i--){
            value=happiness[i]-j++;
            if(value>0)
            {
                res+=value;
            }
        }
        return res;
    }
}