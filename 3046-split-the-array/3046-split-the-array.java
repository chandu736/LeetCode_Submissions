class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] count=new int[101];
        for(int i:nums){
            count[i]++;
            if(count[i]>2) return false;
        }
        return true;
    }
}