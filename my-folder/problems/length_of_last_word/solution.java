class Solution {
    public int lengthOfLastWord(String s) {
        int lengthOfLastWord=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                lengthOfLastWord++;
            }else{
                if(lengthOfLastWord>0) return lengthOfLastWord;
            }
        }
        return lengthOfLastWord;
    }
}