class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        int size=0;
        for(int num:nums){
            int i=0;
            int j=size;
            while(i!=j){
                int m=(i+j)/2;
                if(dp[m]<num){
                    i=m+1;
                }else{
                    j=m;
                }
            }
            dp[i]=num;
            if(i==size) ++size;
        }
        return size;
    }
}