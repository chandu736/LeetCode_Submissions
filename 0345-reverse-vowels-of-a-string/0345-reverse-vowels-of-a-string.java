class Solution {
    public String reverseVowels(String s) {
        char[] chars=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        String vowles="aeiouAEIOU";
        while(start<end){
            while(start<end && vowles.indexOf(chars[start])==-1){
                start++;
            }
            while(start<end && vowles.indexOf(chars[end])==-1){
                end--;
            }
            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}