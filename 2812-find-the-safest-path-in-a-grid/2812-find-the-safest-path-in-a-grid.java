class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int[][] safeGrid=safteyGrid(grid);
        return dijkstra(safeGrid);
    }

    int dijkstra(int[][] safeGrid){
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[2]-a[2]);
        pq.add(new int[]{0,0,safeGrid[0][0]});
        safeGrid[0][0]=-1;
        while(!pq.isEmpty()){
            int[] curr=pq.remove();
            if(curr[0]==safeGrid.length-1 && curr[1]==safeGrid[0].length-1){
                return curr[2];
            }
            for(int i=0;i<4;i++){
                int newX=curr[0]+x[i];
                int newY=curr[1]+y[i];
                if(isValid(newX, newY, safeGrid.length) && safeGrid[newX][newY]!=-1){
                    pq.add(new int[]{newX, newY, Math.min(curr[2], safeGrid[newX][newY])});
                    safeGrid[newX][newY]=-1;
                }
            }
        }
        return 0;
    }

    int[] x={-1,0,0,1};
    int[] y={0,-1,1,0};
    int[][] safteyGrid(List<List<Integer>> grid){
        int[][] safeGrid=new int[grid.size()][grid.getFirst().size()];
        for(int[] row:safeGrid){
            Arrays.fill(row, -1);
        }
        Queue<int[]> q=new LinkedList<>();
        for(int row=0;row<grid.size();row++){
            for(int col=0;col<grid.getFirst().size();col++){
                if(grid.get(row).get(col)==1){
                    safeGrid[row][col]=0;
                    q.add(new int[]{row, col, 0});
                }
            }
        }
        while(!q.isEmpty()){
            int[] curr=q.remove();
            for(int i=0;i<4;i++){
                int newX=curr[0]+x[i];
                int newY=curr[1]+y[i];
                if(isValid(newX, newY, grid.size()) && safeGrid[newX][newY]==-1){
                    safeGrid[newX][newY]=curr[2]+1;
                    q.add(new int[]{newX, newY, curr[2]+1});
                }
            }
        }
        return safeGrid;
    }
    boolean isValid(int x, int y, int n){
        return x>=0 && y>=0 && x<n && y<n;
    }
}