class Solution {
    public int uniqueLetterString(String s) {
        int length=s.length();
        int[] right=new int[length];
        int[] left=new int[26];
        Arrays.fill(right,length);
        Arrays.fill(left,length);
        int ans=0;
        for(int i=length-1;i>=0;i--){
            int curr=s.charAt(i)-'A';
            right[i]=left[curr];
            left[curr]=i;
        }
        Arrays.fill(left,-1);
        for(int i=0;i<length;i++){
            int curr=s.charAt(i)-'A';
            int sum=(right[i]-i)*(i-left[curr]);
            ans+=sum;
            left[curr]=i;
        }
        return ans;
    }
}