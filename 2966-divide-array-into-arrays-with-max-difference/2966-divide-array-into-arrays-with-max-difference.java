class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int[][] res=new int[n/3][3];
        int val=0;
        for(int i=0;i<n;i+=3){
            int first=nums[i];
            int second=nums[i+1];
            int third=nums[i+2];
            if(third-first<=k){
                res[val][0]=first;
                res[val][1]=second;
                res[val][2]=third;
                val++;
            }else{
                return new int[][]{};
            }
        }
        return res;
    }
}