class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> result=new ArrayList<>();
        for(int num:nums){
            int index=Math.abs(num)-1;
            if(nums[index]<0){
                result.add(Math.abs(num));
            }else{
                nums[index]=-nums[index];
            }
        }
        return result;
    }
}