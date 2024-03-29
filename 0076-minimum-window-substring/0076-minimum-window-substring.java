class Solution {
    public String minWindow(String s, String t) {
        int[] freq=new int[123];
        for(char ch:t.toCharArray()){
            freq[ch-'A']++;
        }
        return slideWindow(freq,s);
    }
    int l,r;
    public String slideWindow(int[] freq,String s){
        r=Integer.MAX_VALUE;
        l=0;

        int left=0;
        int right=0;
        int[] anotherFreqArr=new int[123];
        while(right<s.length()){
            anotherFreqArr[s.charAt(right)-'A']++;
            while(checkFreq(freq,anotherFreqArr)){
                if(right-left<r-l){
                    l=left;
                    r=right;
                }
                anotherFreqArr[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return r==Integer.MAX_VALUE?"":s.substring(l,r+1);
    }
    boolean checkFreq(int[] tFreq,int[] sFreq){
        for(int i=0;i<123;i++){
            if(tFreq[i]!=0 && sFreq[i]<tFreq[i]) return false;
        }
        return true;
    }
}