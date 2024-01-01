class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int currChild=0;
        int currCookie=0;
        while(currCookie<s.length && currChild<g.length){
            if(s[currCookie]>=g[currChild]){
                currChild++;
            }
            currCookie++;
        }
        return currChild;
    }
}