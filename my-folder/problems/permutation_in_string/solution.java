class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] tempArray1=s1.toCharArray();
        Arrays.sort(tempArray1);
        String sortedS1=new String(tempArray1);
        for(int i=0;i<s2.length()-s1.length()+1;i++){
            String temp=s2.substring(i,i+s1.length());
            char[] tempArray=temp.toCharArray();
            Arrays.sort(tempArray);
            String sortedTemp=new String(tempArray);
            if(sortedS1.equals(sortedTemp)){
                return true;
            }
        }
        return false;
    }
}