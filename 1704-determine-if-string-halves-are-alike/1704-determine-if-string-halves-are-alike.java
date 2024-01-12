class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();

        String firstHalf=s.substring(0,n/2);
        String secondHalf=s.substring(n/2);

        int vowlesInFirstHalf=countVowles(firstHalf);
        int vowlesInSecondHalf=countVowles(secondHalf);

        return vowlesInFirstHalf==vowlesInSecondHalf;
    }
    private static int countVowles(String str){
        int count=0;
        for(char ch:str.toCharArray()){
            if("AEIOUaeiou".indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }
}