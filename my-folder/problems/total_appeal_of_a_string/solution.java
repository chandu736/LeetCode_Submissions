class Solution {
    public long appealSum(String s) {
        int[] arr=new int[26];
        long ans=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i+1;
            ans+=sum(arr);
        }
        return ans;
    }
    private long sum(int[] arr){
        long sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
}