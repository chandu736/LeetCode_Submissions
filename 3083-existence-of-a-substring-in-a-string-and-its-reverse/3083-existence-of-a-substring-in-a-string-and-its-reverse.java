class Solution {
    public boolean isSubstringPresent(String s) {
        int n=s.length();
        for(int i=0;i<n-1;i++){
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            for(int j=0;j<n-1;j++){
                if(s.charAt(j)==b && s.charAt(j+1)==a) return true;
            }
        }
        return false;
    }
}