class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(sentence.charAt(i),1);
        }
        if(map.size()==26){
            return true;
        }
        return false;
    }
}