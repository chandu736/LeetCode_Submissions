class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        char suit = suits[0];
        boolean flag = true;
        for(char c : suits)
        {
            if(suit!=c)
            {
                flag = false;
                break;
            }
        }
        if(flag)
            return "Flush";
        Map<Integer, Integer> rank = new HashMap<>();
        for(int  i : ranks)
        {
            if(!rank.containsKey(i))
            {
                rank.put(i,1);
            }
            else
            {
                int count = rank.get(i);
                rank.put(i,++count);
            }
        }
        int count = 0 ;
        for(int i : rank.keySet())
        {
            if(rank.get(i)>count)
                count = rank.get(i);
        }

        if(count==2)
            return "Pair";
        else if(count==1)
            return "High Card";
        else
            return "Three of a Kind";
    }
}