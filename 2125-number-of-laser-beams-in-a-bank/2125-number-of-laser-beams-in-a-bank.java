class Solution {
    public int numberOfBeams(String[] bank) {
        int prevRowCount=0;
        int total=0;
        for(String row:bank){
            int currRowCount=checkSecurityDevices(row);
            if(currRowCount==0)
            continue;
            total+=currRowCount*prevRowCount;
            prevRowCount=currRowCount;
        }
        return total;
    }
    private int checkSecurityDevices(String str){
        int count=0;
        for(char ch:str.toCharArray()){
            count+=ch-'0';
        }
        return count;
    }
}