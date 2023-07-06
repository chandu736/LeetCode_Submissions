class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int maxvalue=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                if(!map.containsKey(nums[i+1])){
                    map.put(nums[i+1],1);
                }else{
                    map.put(nums[i+1],map.get(nums[i+1])+1);
                }
                if(max<map.get(nums[i+1])){
        max=map.get(nums[i+1]);
        maxvalue=nums[i+1];
    }
            }
        }
        return maxvalue;
    }
}