class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int totalSum = mean * ( n + m );
        int sum = 0;
        for(int i : rolls){
            sum+=i;
        }
        int missingSum = totalSum-sum;
        if(missingSum<n || missingSum>6*n){
            return new int[0];
        }
        int[] ans=new int[n];
        int baseVal=missingSum/n;
        int remainder=missingSum%n;
        for(int i=0;i<n;i++){
            ans[i]=baseVal;
        }
        for (int i = 0; i < remainder; i++) {
            ans[i]++;
        }
        return ans;
    }
}