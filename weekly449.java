public class weekly449 {
    public static void main(String[] args) {
        int[][] grid = {{1,2},{3,4}};
        canPartitionGrid(grid);
    }

    public static boolean canPartitionGrid(int[][] grid) {
        int vcut = 1;
        int hcut = 1;
        int vsum = 0;
        int hsum = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
              if(i == 0){
                 vsum += grid[i][j];
              }
              if(j == 0){
                hsum += grid[i][j];
             }
            }
        }
        return false;
    }
}
