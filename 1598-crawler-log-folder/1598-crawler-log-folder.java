class Solution {
    public int minOperations(String[] logs) {
        int n=logs.length;
        int ans=0;
        for(String log:logs){
            if(log.equals("../")){
                if(ans>0) ans--;
            }else if(!log.equals("./")){
                ans++;
            }
        }
        return ans;
    }
}