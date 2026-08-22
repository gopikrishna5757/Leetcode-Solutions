class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ilands = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    ilands++;
                    q.add(new int[] { i, j });
                    while (q.size() != 0) {
                        int[] temp = q.poll();
                        int row = temp[0];
                        int col = temp[1];
                        if (row != 0 && grid[row - 1][col] == '1') {
                            q.offer(new int[] { row - 1, col });
                            grid[row - 1][col] = '0';

                        }
                        if (row != n - 1 && grid[row + 1][col] =='1') {
                            q.offer(new int[] { row + 1, col });
                            grid[row + 1][col] ='0';

                        }
                        if (col != 0 && grid[row][col - 1] == '1') {
                            q.offer(new int[] { row, col - 1 });
                            grid[row][col - 1] = '0';

                        }
                        if (col != m - 1 && grid[row][col + 1] == '1') {
                            q.offer(new int[] { row, col + 1 });
                            grid[row][col + 1] = '0';

                        }
                    }
                }
            }

        }

    return ilands;}
}