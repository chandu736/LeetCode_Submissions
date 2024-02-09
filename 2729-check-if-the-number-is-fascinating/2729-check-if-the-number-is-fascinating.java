class Solution {
    public boolean isFascinating(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=3;i++){
            int num=i*n;
            while(num>0){
                int digit=num%10;
                if(map.containsKey(digit) || digit==0){
                    return false;
                }else{
                    map.put(digit,1);
                }
                num/=10;
            }
        }
        return true;
    }
}