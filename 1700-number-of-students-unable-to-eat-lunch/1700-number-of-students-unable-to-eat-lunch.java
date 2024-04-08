class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count={0,0};
        for(int student:students){
            count[student]++;
        }
        for(int i=0;i<students.length;i++){
            if(count[sandwiches[i]]>0){
                count[sandwiches[i]]--;
            }else{
                return sandwiches.length-i;
            }
        }
        return 0;
    }
}