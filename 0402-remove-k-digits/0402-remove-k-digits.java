class Solution {
    public String removeKdigits(String num, int k) {
        int top=-1;
        int n=num.length();
        int start=0;
        int digits=n-k;

        if(n==k) return "0";

        char[] arr=num.toCharArray();
        for(int i=0;i<n;i++){
            while(top>=0 && arr[top]>arr[i] && k>0){
                top--;
                k--;
            }
            top++;
            arr[top]=arr[i];
        }
        while(start<=top && arr[start]=='0'){
            start++;
        }
        String str=new String(arr);
        return start>=digits ?"0":str.substring(start,digits);
    }
}