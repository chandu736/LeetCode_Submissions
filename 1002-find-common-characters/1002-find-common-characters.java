class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq1=count(words[0]);
        for(int i=1;i<words.length;i++){
            freq1=intersection(freq1,count(words[i]));
        }
        List<String> result=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(freq1[i]!=0){
                char ch=(char)('a'+i);
                String s=String.valueOf(ch);
                while(freq1[i]>0){
                    result.add(s);
                    freq1[i]--;
                }
            }
        }
        return result;
    }
    private int[] intersection(int[] freq1, int[] freq2){
        int[] freq=new int[26];
        for(int i=0;i<26;i++){
            freq[i]=Math.min(freq1[i],freq2[i]);
        }
        return freq;
    }
    private int[] count(String str){
        int[] freq=new int[26];
        for(char ch:str.toCharArray()){
            freq[ch-'a']++;
        }
        return freq;
    }
}