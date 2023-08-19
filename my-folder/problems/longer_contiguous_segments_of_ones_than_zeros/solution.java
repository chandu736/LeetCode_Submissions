class Solution {
    public boolean checkZeroOnes(String s) {
        int n=s.length();
        int max0=0;
        int max1=0;
        int count0=0;
        int count1=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='0'){
                count0++;
                max1=Math.max(count1,max1);
                count1=0;
            }else{
                count1++;
                max0=Math.max(count0,max0);
                count0=0;
            }
        }
        max1=Math.max(max1,count1);
        max0=Math.max(max0,count0);
        return max1>max0;
    }
}