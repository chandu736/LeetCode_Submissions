class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        Arrays.sort(tokens);
        int currScore=0;
        int maxScore=0;
        int left=0;
        int right=n-1;
        while(left<=right){
            if(power>=tokens[left]){
                power-=tokens[left++];
                currScore++;
                maxScore=Math.max(maxScore,currScore);
            }else if(currScore>0){
                power+=tokens[right--];
                currScore--;
            }else{
                break;
            }
        }
        return maxScore;
    }
}