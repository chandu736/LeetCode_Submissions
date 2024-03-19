class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;
        }
        Arrays.sort(freq);
        int maxFreq=freq[25];
        int maxCount=1;
        for(int i=24;i>=0;i--){
            if(freq[i]!=maxFreq)break;
            maxCount++;
        }

        int parts=maxFreq-1;
        int emptySlots=parts*(n-(maxCount-1));
        int availableTasks=tasks.length-(maxFreq*maxCount);
        int idles=Math.max(0,emptySlots-availableTasks);
        return tasks.length+idles;
    }
}