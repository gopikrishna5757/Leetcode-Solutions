class Solution {
    static long mod = (int)1e9 + 7;
    public static int find(int[][] grid, int n, int m, int row, int col, int dir, int[][][] dp) {
        if (row >= n || col >= m) {
            return 0;
        }
        if (row == n - 1 && col == m - 1)
            return 1;
        if (dp[row][col][dir] != -1) {
            return dp[row][col][dir];
        } else {
            if (grid[row][col] == 1) {
                if (dir == 0) {
                    return dp[row][col][dir]=find(grid, n, m, row, col + 1, 1, dp);
                } else {
                    return dp[row][col][dir]=find(grid, n, m, row + 1, col, 0, dp);
                }
            }
            return dp[row][col][dir]=(int)((find(grid, n, m, row + 1, col, 0, dp) + find(grid, n, m, row, col + 1, 1, dp))%mod);


        }
        

        
    }

    public int uniquePaths(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][][] dp = new int[n][m][2];
        for (int[][] k : dp) {
            for (int[] l : k) {
                Arrays.fill(l, -1);
            }
        }

        return find(grid, n, m, 0, 0, 0, dp);
    }
}