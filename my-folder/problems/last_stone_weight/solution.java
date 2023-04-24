import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int weight:stones){
            pq.add(weight);
        }
        while(pq.size()!=1 && !pq.isEmpty()){
            int y=pq.poll();
            int x=pq.poll();
            if(x!=y){
                pq.add(y-x);
            }
        }
        if(pq.size()==1){
            return pq.peek();
        }
        return 0;
    }
}