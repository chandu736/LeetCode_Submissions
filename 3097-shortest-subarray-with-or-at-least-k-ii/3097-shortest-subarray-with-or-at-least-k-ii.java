class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int right=0;
        int or = 0;
        int[] bits=new int[32];

        if(k==0) return 1;

        while(right<n){
            or|=nums[right];
            add(bits,nums[right]);
            while(or>=k){
                minLen=Math.min(minLen,right-left+1);
                or=remove(bits,nums[left]);
                left++;
            }
            right++;
        }
        return minLen!=Integer.MAX_VALUE?minLen:-1;
    }
    private static int remove(int[] arr,int x){
        int i=0;
        while(x>0){
            if((x&1)==1){
                arr[i]--;
            }
            x>>=1;
            i++;
        }
        int decimal=0;
        i=0;
        for(;i<32;i++){
            if(arr[i]>0) decimal+=Math.pow(2,i);
        }
        return decimal;
    }
    private static void add(int[] arr,int x){
        int i=0;
        while(x>0){
            if((x&1)==1){
                arr[i]++;
            }
            x>>=1;
            i++;
        }
    }
}
