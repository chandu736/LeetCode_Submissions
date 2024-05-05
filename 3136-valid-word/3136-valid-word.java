class Solution {
    public boolean isValid(String word) {
        if (word == null || word.length() < 3) {
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (vowels.indexOf(c) != -1) {
                hasVowel = true;
            }
            else if (Character.isLetter(c) && vowels.indexOf(c) == -1) {
                hasConsonant = true;
            }
        }
        return hasVowel && hasConsonant;
    }
}