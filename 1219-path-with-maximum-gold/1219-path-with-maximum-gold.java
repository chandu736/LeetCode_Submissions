class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxGold=0;
        int rows=grid.length;
        int cols=grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]!=0){
                    maxGold=Math.max(maxGold, dfs(grid,i,j));
                }
            }
        }
        return maxGold;
    }
    private int dfs(int[][] grid, int row, int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
            return 0;
        }
        int gold=grid[row][col];
        grid[row][col]=0;
        int maxGold=0;
        maxGold=Math.max(maxGold, dfs(grid, row+1, col));
        maxGold=Math.max(maxGold, dfs(grid, row-1, col));
        maxGold=Math.max(maxGold, dfs(grid, row, col+1));
        maxGold=Math.max(maxGold, dfs(grid, row, col-1));
        grid[row][col]=gold;
        return gold+maxGold;
    }
}