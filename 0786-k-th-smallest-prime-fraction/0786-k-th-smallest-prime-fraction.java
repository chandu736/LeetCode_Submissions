class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double low=0;
        double high=1;
        int[] result=new int[2];
        while(low<high){
            double mid=low+(high-low)/2;
            int count=0;
            int j=1;
            double maxFraction=0.0;
            for(int i=0;i<arr.length-1;i++){
                while(j<arr.length && arr[i]>mid*arr[j]){
                    j++;
                }
                count+=(arr.length-j);
                if(j<arr.length && arr[i]/(double)arr[j]>maxFraction){
                    maxFraction=arr[i]/(double) arr[j];
                    result[0]=arr[i];
                    result[1]=arr[j];
                }
            }
            if(count==k){
                break;
            }else if(count<k){
                low=mid;
            }else{
                high=mid;
            }
        }
        return result;
    }
}