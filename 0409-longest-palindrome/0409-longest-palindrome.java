class Solution {
    public int longestPalindrome(String s) {
        int [] charCount = new int[128];
        for(char c: s.toCharArray())
        {
            charCount[c]++;
        }
        int result = 0;
        for(int count : charCount)
        {   
            result += count/2 * 2;
            if(result%2==0 && count%2==1)
            {
                result+=1;
            }
        }
        return result;
    }
}