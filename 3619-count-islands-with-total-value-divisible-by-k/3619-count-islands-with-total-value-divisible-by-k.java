class Solution {
    public long dfs(int[][] grid,int row,int col,int n,int m){
        if(row<0||col<0||row==n||col==m||grid[row][col]==0) return 0;
        int cur=grid[row][col];
        grid[row][col]=0;
        return cur+dfs(grid,row+1,col,n,m)+dfs(grid,row-1,col,n,m)+dfs(grid,row,col+1,n,m)+dfs(grid,row,col-1,n,m);

    }
    public int countIslands(int[][] grid, int k) {
        int  n= grid.length;
        int m = grid[0].length,c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0){
                    
                    long sum=dfs(grid,i,j,n,m);
                    //System.out.println(sum);
                    if(sum%k==0){
                        c++;
                    }
                }
            }
        }

        
   return c; }
}