class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        while(numBottles>=numExchange){
            int completedBottles=numBottles/numExchange;
            int remaining=numBottles%numExchange;
            numBottles=completedBottles+remaining;
            count+=completedBottles;
        }
        return count;
    }
}