class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Arrays.fill(left,-1);
        Arrays.fill(right,n);
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                left[i]=stack.peek();
            }
            stack.push(i);
        }
        stack.clear();

        for(int i=n-1;i>=0;--i){
            while(!stack.isEmpty() && arr[i]<arr[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                right[i]=stack.peek();
            }
            stack.push(i);
        }
        int mod=(int)1e9+7;
        long result=0;
        for(int i=0;i<n;i++){
            result+=(long) (i-left[i])*(right[i]-i)%mod*arr[i]%mod;
            result%=mod;
        }
        return (int)result;
    }
}