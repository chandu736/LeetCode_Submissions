class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
            int temp=i;
            int rev=0;
            while(temp!=0){
                int r=temp%10;
                rev=rev*10+r;
                temp=temp/10;
            }
            if((i+rev)==num) return true;
        }
        return false;
    }
}