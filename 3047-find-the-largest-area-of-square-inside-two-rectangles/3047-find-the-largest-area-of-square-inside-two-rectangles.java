class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long maxSide = 0;
        
        for (int i = 0; i < bottomLeft.length; i++) {
            for (int j = i + 1; j < bottomLeft.length; j++) {
                // Calculate intersecting region
                int intersectLeft = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                int intersectBottom = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                int intersectRight = Math.min(topRight[i][0], topRight[j][0]);
                int intersectTop = Math.min(topRight[i][1], topRight[j][1]);
                
                // Check if there is an intersection
                if (intersectRight > intersectLeft && intersectTop > intersectBottom) {
                    int width = intersectRight - intersectLeft;
                    int height = intersectTop - intersectBottom;
                    int side = Math.min(width, height);
                    maxSide = Math.max(maxSide, side);
                }
            }
        }
        return maxSide * maxSide;
    }
}