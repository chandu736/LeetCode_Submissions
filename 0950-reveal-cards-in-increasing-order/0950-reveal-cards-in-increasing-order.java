class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        LinkedList<Integer> deque=new LinkedList<>();
        for(int i=deck.length-1;i>=0;i--){
            if(!deque.isEmpty()){
                deque.addFirst(deque.removeLast());
            }
            deque.addFirst(deck[i]);
        }
        int[] res=new int[deck.length];
        for(int i=0;i<deck.length;i++){
            res[i]=deque.removeFirst();
        }
        return res;
    }
}