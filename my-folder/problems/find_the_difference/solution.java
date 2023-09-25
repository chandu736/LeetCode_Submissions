class Solution {
    public char findTheDifference(String s, String t) {
        char unique=0;
        for(char i:s.toCharArray()){
            unique^=i;
        }
        for(char j:t.toCharArray()){
            unique^=j;
        }
        return unique;
    }
}