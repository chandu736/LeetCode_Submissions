class Solution {
    public int minimumOperations(int[] nums, int start, int goal) {
        if(start==goal) return 0;
        Queue<Integer> queue=new LinkedList<>();
        Set<Integer> set=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();

        queue.offer(start);
        set.add(start);
        map.put(start,0);

        while(!queue.isEmpty()){
            int curr=queue.poll();
            for(int num:nums){
                int next=curr+num;
                if(next==goal) return map.get(curr)+1;
                if(next>=0 && next<=1000 && !set.contains(next)){
                    queue.offer(next);
                    set.add(next);
                    map.put(next,map.get(curr)+1);
                }
                next=curr-num;
                if(next==goal) return map.get(curr)+1;
                if(next>=0 && next<=1000 && !set.contains(next)){
                    queue.offer(next);
                    set.add(next);
                    map.put(next,map.get(curr)+1);
                }
                next=curr^num;
                if(next==goal) return map.get(curr)+1;
                if(next>=0 && next<=1000 && !set.contains(next)){
                    queue.offer(next);
                    set.add(next);
                    map.put(next,map.get(curr)+1);
                }
            }
        }
        return -1;
    }
}