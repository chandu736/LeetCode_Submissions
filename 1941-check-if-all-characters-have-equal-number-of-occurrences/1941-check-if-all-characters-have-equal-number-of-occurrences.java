class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int n=map.get(s.charAt(0));
        for(char i:map.keySet()){
            if(map.get(i)!=n){
                return false;
            }
        }
        return true;
    }
}