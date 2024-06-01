class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n-1;i++){
            int ch1=s.charAt(i);
            int ch2=s.charAt(i+1);
            sum+=Math.abs((ch1-'a')-(ch2-'a'));
        }
        return sum;
    }
}