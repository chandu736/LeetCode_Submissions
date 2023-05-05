class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder rev=new StringBuilder(words[i]);
            res.append(rev.reverse());
            res.append(" ");
        }
        return res.toString().trim();
    }
}