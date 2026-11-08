class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int c=0;
        int[] row= new int[n];
        int[] cols= new int[m];
        for(int i=0;i<n;i++){
            int sum=0;
            
            for(int j=0;j<m&&sum<2;j++){
                sum+=grid[i][j];
            }
            row[i]=sum;
        }
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n&&sum<2;j++){
                sum+=grid[j][i];
            }
            cols[i]=sum;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(row[i]>1||cols[j]>1){
                        c++;
                    }
                }
                   
            }
        }
        
        
   return c; }
}