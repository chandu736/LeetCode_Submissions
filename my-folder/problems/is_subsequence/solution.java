class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int s1=0;
        for(int i=0;i<t.length();i++){
            if(s1<s.length()&&t.charAt(i)==s.charAt(s1)){
                s1++;
            }
        }
        if(s1==s.length()) return true;
        return false;
    }
}