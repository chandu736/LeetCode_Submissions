class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] res=new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                res[i][j]=findMax(grid,i+1,j+1);
            }
        }
        return res;
    }
    static int findMax(int[][] grid, int i, int j){
        int n=grid.length;
        int max=grid[i][j];
        for(int k=i-1;k<i+2;k++){
            for(int l=j-1;l<j+2;l++){
                max=Math.max(grid[k][l],max);
            }
        }
        return max;
    }
}