class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[123];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        List<Character>[] buckets=new ArrayList[s.length()+1];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new ArrayList<>();
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                buckets[freq[i]].add((char)i);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=buckets.length-1;i>=0;i--){
            for(char c:buckets[i]){
                for(int j=0;j<i;j++){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}