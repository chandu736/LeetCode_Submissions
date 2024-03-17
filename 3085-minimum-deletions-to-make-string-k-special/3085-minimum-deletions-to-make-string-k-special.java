class Solution {
    public int minimumDeletions(String word, int k) {
        int n=word.length();
        int[] count=new int[26];
        int ans=Integer.MAX_VALUE;
        for(char ch:word.toCharArray()){
            count[ch-'a']++;
        }
        for(int i:count){
            int curr=0;
            for(int j:count){
                curr+=j<i?j:Math.max(0,j-k-i);
            }
            ans=Math.min(ans,curr);
        }
        return ans;
    }
}
