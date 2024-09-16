class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes=new int[timePoints.size()];
        for(int i=0;i<timePoints.size();i++){
            String[] parts=timePoints.get(i).split(":");
            int hours=Integer.parseInt(parts[0]);
            int mins=Integer.parseInt(parts[1]);
            minutes[i]=hours*60+mins;
        }
        Arrays.sort(minutes);
        int minDiff=1440+minutes[0]-minutes[minutes.length-1];
        for(int i=1;i<minutes.length;i++){
            int diff=minutes[i]-minutes[i-1];
            minDiff=Math.min(minDiff,diff);
        }
        return minDiff;
    }
}