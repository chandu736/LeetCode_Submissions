class Solution {
    public int pivotInteger(int n) {
        int leftSum=0;
        for(int i=1;i<=n;i++){
            leftSum+=i;
            int rightSum=0;
            for(int j=i;j<=n;j++){
                rightSum+=j;
            }
            if(leftSum==rightSum) return i;
        }
        return -1;
    }
}