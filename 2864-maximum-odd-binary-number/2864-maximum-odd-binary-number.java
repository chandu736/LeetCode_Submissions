class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<ones-1;i++){
            res.append('1');
        }
        for(int i=0;i<s.length()-ones;i++){
            res.append('0');
        }
        res.append('1');
        return res.toString();
    }
}