class Solution {
    public int nextBeautifulNumber(int n) {
        n+=1;
        while(!isNumericallyBalanced(n)){
            n++;
        }
        return n;
    }
    private boolean isNumericallyBalanced(int n){
        int[] count=new int[10];
        while(n>0){
            int digit=n%10;
            count[digit]++;
            n/=10;
        }
        for(int i=0;i<10;i++){
            if(count[i]!=0 && count[i]!=i){
                return false;
            }
        }
        return true;
    }
}