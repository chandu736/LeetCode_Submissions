class Solution {
    public int minimumLevels(int[] possible) {
        int sum=0;
        for(int i=0;i<possible.length;i++){
            sum+=possible[i]==0?-1:1;
        }
        int bSum=0;
        for(int i=0;i<possible.length-1;i++){
            bSum+=possible[i]==0?-1:1;
            if(bSum>(sum-bSum)){
                return i+1;
            }
        }
        return -1;
    }
}