class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long total=0;
        for(int i:chalk){
            total+=i;
        }

        int remaining=(int)(k%total);
        for(int i=0;i<chalk.length;i++){
            if(remaining<chalk[i]){
                return i;
            }
            remaining-=chalk[i];
        }
        return 0;
    }
}