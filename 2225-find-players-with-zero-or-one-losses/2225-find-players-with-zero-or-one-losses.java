class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
            map.put(matches[i][0],map.getOrDefault(matches[i][0],0));
        }
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==0)
            res.get(0).add(entry.getKey());
            else if(entry.getValue()==1)
            res.get(1).add(entry.getKey());
        }
        Collections.sort(res.get(0));
        Collections.sort(res.get(1));
        return res;
    }
}