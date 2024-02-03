class Solution {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int left=nums.length;
        int right=0;
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[i]<nums[stack.peek()]){
                left=Math.min(left,stack.pop());
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                right=Math.max(right,stack.pop());
            }
            stack.push(i);
        }
        return right-left>0?(right-left+1):0;
    }
}