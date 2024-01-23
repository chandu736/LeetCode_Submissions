class Solution {
    public int maxLength(List<String> arr) {
        return helper(arr,arr.size()-1,"");
    }
    int helper(List<String> arr,int index,String ans){
        if(index==-1) return ans.length();

        int pick=0;
        if(isUniqueChars(ans,arr.get(index))){
            pick=helper(arr,index-1,ans+arr.get(index));
        }
        int dontPick=helper(arr,index-1,ans);
        return Math.max(pick,dontPick);
    }
    boolean isUniqueChars(String s1,String s2){
        int[] freq=new int[26];
        for(char ch:s1.toCharArray()){
            if(freq[ch-'a']==1){
                return false;
            }
            freq[ch-'a']++;
        }
        for(char ch:s2.toCharArray()){
            if(freq[ch-'a']==1 || freq[ch-'a']==-1){
                return false;
            }
            freq[ch-'a']--;
        }
        return true;
    }
}