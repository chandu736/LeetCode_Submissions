class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int res=0;
        HashSet<Integer> frequinces=new HashSet<>();
        for(char c:s.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        for(int freq:hashMap.values()){
            while(freq>0 && frequinces.contains(freq)){
                freq--;
                res++;
            }
            frequinces.add(freq);
        }
        return res;
    }
}