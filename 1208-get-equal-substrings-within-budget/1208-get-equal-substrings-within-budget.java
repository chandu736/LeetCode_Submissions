class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }

        int ans=0;
        int sum=0;
        int left=0;
        int right=0;
        while(right<arr.length){
            sum+=arr[right];
            while(sum>maxCost){
                sum-=arr[left];
                left++;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}