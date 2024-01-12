class Solution {
    public int hardestWorker(int n, int[][] logs) {
         int out=-1;
         int currMax=0;
         int start=0;
         for(int[] log:logs){
             int time=log[1]-start;
             if(time>currMax || (time==currMax && out>log[0])){
                 currMax=time;
                 out=log[0];
             }
             start=log[1];
         }
         return out;
    }
}