class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        boolean[] found=new boolean[101];
        found[0]=true;
        for(int num:nums){
            if(!found[num]){
                found[num]=true;
                ans++;
            }
        }
        return ans;
    }
}