class Solution {
    public int pivotIndex(int[] nums) {
        int lSum=0,total=0;
        for(int i:nums){
            total=total+i;
        }
        for(int j=0;j<nums.length;lSum+=nums[j++]){
            if(lSum*2==total-nums[j])
            return j;
        }
        return -1;
    }
}