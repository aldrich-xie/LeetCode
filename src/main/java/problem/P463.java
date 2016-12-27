package problem;

public class P463 {
    public int islandPerimeter(int[][] grid) {
        int height = grid.length;
        int totalIslands = 0;
        int duplicateEdge = 0;
        for(int i=0; i<height; i++) {
            int[] horizon = grid[i];
            int width = horizon.length;
            for (int j=0; j<width; j++) {
                if (horizon[j] == 1) {
                    totalIslands++;
                    duplicateEdge += getGridVal(i - 1, j, height, width, grid) + getGridVal(i + 1, j, height, width, grid)
                            + getGridVal(i, j - 1, height, width, grid) + getGridVal(i, j + 1, height, width, grid);
                }
            }
        }
        return totalIslands * 4 - duplicateEdge;
    }

    private int getGridVal(int i, int j, int height, int width, int[][] grid) {
        return i < 0 || i >= height || j< 0 || j >= width ? 0 : grid[i][j];
    }
}
