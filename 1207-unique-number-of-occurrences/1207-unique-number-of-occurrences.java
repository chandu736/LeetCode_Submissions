class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(Integer i:map.values()){
            if(!set.add(i)){
                return false;
            }
        }
        return true;
    }
}