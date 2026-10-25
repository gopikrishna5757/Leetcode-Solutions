class Solution {
    
    public boolean dfs(int[][] grid,int row,int col,int n ,int m){
        if(row<0||row==n||col<0||col==m){
            return false ;
        }
        if(grid[row][col]==1) return true;
        grid[row][col]=1;
        boolean bot=dfs(grid,row+1,col,n,m);
       boolean up= dfs(grid,row-1,col,n,m);
        boolean left=dfs(grid,row,col+1,n,m);
        boolean right=dfs(grid,row,col-1,n,m);
        return bot&&up&&left&&right;

    }
    
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length,c=0;
        //boolean[][] vis= new boolean[n][m];
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    
                    if(dfs(grid,i,j,n,m)){
                        c++;
                    }
                   
                }
            }
        }
   return c; }
}