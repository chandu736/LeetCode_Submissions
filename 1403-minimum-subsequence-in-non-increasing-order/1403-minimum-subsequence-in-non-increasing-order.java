class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int index=nums.length-1;
        List<Integer> res=new ArrayList<>();
        for(int i:nums){
            sum+=i;
        }
        int sumOfSeq=0;
        while(sumOfSeq<=sum && index>=0){
            sumOfSeq+=nums[index];
            sum-=nums[index];
            res.add(nums[index]);
            index--;
        }
        return res;
    }
}