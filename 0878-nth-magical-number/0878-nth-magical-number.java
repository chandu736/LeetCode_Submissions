class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long num1=a;
        long num2=b;
        long mod=(long)(1000000007);

        long left=Math.min(a,b);
        long right=(long)n*Math.min(a,b);

        while(num2>0){
            long temp=num1;
            num1=num2;
            num2=temp%num2;
        }

        long lcm=(a*b)/num1;
        while(left<right){
            long mid=left+(right-left)/2;
            if((mid/a)+(mid/b)-(mid/lcm)<n) left=mid+1;
            else right=mid;
        }
        return (int)(left%mod);
    }
}