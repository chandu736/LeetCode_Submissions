class Solution {
    public int findMaxK(int[] nums) {
        int max = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] > 0){
                set.add(nums[i]);
            }
        }
         for(int i = 0; i < nums.length ; i++){
            if(nums[i] < 0 && (-1)*nums[i] > max){
                if(set.contains((-1)*nums[i])){
                    max = (-1)*nums[i];
                }
            }
        }
        return max;
    }
}