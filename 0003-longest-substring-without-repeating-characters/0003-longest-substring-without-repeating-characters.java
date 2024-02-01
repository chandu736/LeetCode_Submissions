class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        Set<Character> charSet=new HashSet<>();
        int l=0;
        for(int i=0;i<n;i++){
            if(!charSet.contains(s.charAt(i))){
                charSet.add(s.charAt(i));
                max=Math.max(max,i-l+1);
            }else{
                while(charSet.contains(s.charAt(i))){
                    charSet.remove(s.charAt(l));
                    l++;
                }
                charSet.add(s.charAt(i));
            }
        }
        return max;
    }
}