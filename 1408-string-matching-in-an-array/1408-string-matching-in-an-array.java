class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> res=new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].contains(words[j])){
                    res.add(words[j]);
                }else if(words[j].contains(words[i])){
                    res.add(words[i]);
                }
            }
        }
        return new ArrayList<>(res);
    }
}