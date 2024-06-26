class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[i].length;j++){
                if(land[i][j]==1){
                    int[] landCoordinates=findLandBoundary(land,i,j);
                    ans.add(landCoordinates);
                }
            }
        }
        return ans.toArray(new int[0][]);
    }
    private int[] findLandBoundary(int[][] land, int startX, int startY){
        int endX=startX;
        int endY=startY;
        for(;endX<land.length && land[endX][startY]==1;endX++){
            for(endY=startY;endY<land[0].length && land[endX][endY]==1;endY++){
                land[endX][endY]=0;
            }
        }
        return new int[]{startX, startY, endX-1, endY-1};
    }
}