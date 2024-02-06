class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> li=new ArrayList<>();
        String prev="";
        for(String str:words){
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr=new String(charArray);
            if(!sortedStr.equals(prev)){
                li.add(str);
                prev=sortedStr;
            }
        }
        return li;
    }
}