class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[nums.length+1];
        for(int i:nums){
            arr[i]++;
        }
        int duplicate=0;
        int missing=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                missing=i;
            }
            if(arr[i]==2){
                duplicate=i;
            }
        }
        return new int[]{duplicate,missing};
    }
}