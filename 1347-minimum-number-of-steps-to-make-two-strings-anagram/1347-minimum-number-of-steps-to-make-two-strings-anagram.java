class Solution {
    public int minSteps(String s, String t) {
        int[] scount=new int[26];
        int[] tcount=new int[26];
        for(char ch:s.toCharArray()){
            scount[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            tcount[ch-'a']++;
        }

        int count=0;
        for(int i=0;i<26;i++){
            count+=Math.abs(scount[i]-tcount[i]);
        }
        return count/2;
    }
}