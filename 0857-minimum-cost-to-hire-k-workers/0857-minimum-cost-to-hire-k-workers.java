class Solution {
    static class Worker implements Comparable<Worker>{
        double ratio;
        int quality;
        int wage;
        Worker(int quality, int wage){
            this.quality=quality;
            this.wage=wage;
            this.ratio=(double) wage/quality;
        }
        public int compareTo(Worker other){
            return Double.compare(this.ratio, other.ratio);
        }
    }
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n=quality.length;
        Worker[] workers=new Worker[n];
        for(int i=0;i<n;i++){
            workers[i]=new Worker(quality[i], wage[i]);
        }
        Arrays.sort(workers);
        double minCost=Double.MAX_VALUE;
        int totalQuality=0;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);
        for(Worker worker:workers){
            totalQuality+=worker.quality;
            maxHeap.add(worker.quality);
            if(maxHeap.size()>k){
                totalQuality-=maxHeap.poll();
            }
            if(maxHeap.size()==k){
                minCost=Math.min(minCost, worker.ratio*totalQuality);
            }
        }
        return minCost;
    }
}