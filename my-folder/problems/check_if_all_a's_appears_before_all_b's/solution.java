class Solution {
    public boolean checkString(String s) {
        int count=0;
        char[] c=s.toCharArray();
        for(char ch:c) if(ch=='a') count++;
        for(int i=0;i<c.length;i++){
            if(c[i]=='b') if(i<count) return false;
        }
        return true;
    }
}