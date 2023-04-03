public class Percolation {

    // 0 is CLOSED 1 is OPEN
    private int[][] grid;
    //test

    public Percolation(int n) {
        grid = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = 0;
            }
        }
    }

    public void open(int row, int col) {
        if (grid[row][col] == 0) {
            grid[row][col] = 1;
        }
    }

    public boolean isFull(int row, int col) {
        if (grid[row][col] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int numberOfOpenSites() {
        int counter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public boolean percolates() {
        return true;
    }


    public static void main(String[] args) {

    }
}
