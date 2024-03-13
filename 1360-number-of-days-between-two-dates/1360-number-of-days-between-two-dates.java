class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(countDays(date1)-countDays(date2));
    }
    private static int countDays(String date){
        int[] daysInMonth={31,28,31,30,31,30,31,31,30,31,30,31};
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8));
        int totalDays=0;
        for(int i=1900;i<year;i++){
            totalDays+=isLeapYear(i)?366:365;
        }
        for(int i=1;i<month;i++){
            totalDays+=daysInMonth[i-1];
            if(i==2 && isLeapYear(year)){
                totalDays++;
            }
        }
        totalDays+=day;
        return totalDays;
    }
    private static boolean isLeapYear(int year){
        return (year%4==0 && year%100!=0) || (year%400==0);
    }
}