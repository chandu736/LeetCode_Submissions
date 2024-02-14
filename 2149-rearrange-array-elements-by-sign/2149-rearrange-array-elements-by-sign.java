class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int j=0,k=1;
        for(int i:nums){
            if(i>0){
                res[j]=i;
                j+=2;
            }else{
                res[k]=i;
                k+=2;
            }
        }
        return res;
    }
}