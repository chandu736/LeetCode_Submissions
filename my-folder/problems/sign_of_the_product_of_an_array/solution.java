class Solution {
    public int arraySign(int[] nums) {
        long res=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res=res*1;
            }else if(nums[i]<0){
                res=res*-1;
            }else{
                res=res*0;
            }
        }
        return signProd(res);
    }
    public int signProd(long result){
            if(result<0) return -1;
            else if(result>0) return 1;
            else return 0;
        }
}