class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(s.length()!=words.size()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char expectedChar=words.get(i).charAt(0);
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(expectedChar)){
                return false;
            }
        }
        return true;
    }
}