class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int count=0;
        for(String word:words){
            if(isTypable(word,brokenLetters)){
                count++;
            }
        }
        return count;
    }
    private static boolean isTypable(String word,String brokenLetters){
        for(char ch:word.toCharArray()){
            if(brokenLetters.indexOf(ch)!=-1){
                return false;
            }
        }
        return true;
    }
}