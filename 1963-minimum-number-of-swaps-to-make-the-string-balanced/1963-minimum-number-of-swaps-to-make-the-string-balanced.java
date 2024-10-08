class Solution {
    public int minSwaps(String s) {
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='['){
                ans++;
            }else if(ans>0){
                ans--;
            }
        }
        return (ans+1)/2;
    }
}