class Solution {
    public int minOperations(int[] nums, int k) {
        int xorAll=0;
        for(int num:nums){
            xorAll^=num;
        }
        int desired = xorAll^k;
        return countBits(desired);
    }
    private int countBits(int n){
        int count=0;
        while(n!=0){
            count+= n & 1;
            n>>>=1;
        }
        return count;
    }
}