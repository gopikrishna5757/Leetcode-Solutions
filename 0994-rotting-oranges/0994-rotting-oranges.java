class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m =grid[0].length;
        Queue<Pair> q= new LinkedList<>();
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int minutes=0;
        while(q.size()>0&&fresh>0){
            int size= q.size();
            for(int i=0;i<size;i++){
                Pair p=q.poll();
                int row=p.first;
                int col=p.second;
                if(row!=0&&grid[row-1][col]==1){
                    q.offer(new Pair(row-1,col));
                    grid[row-1][col]=2;
                    fresh--;
                }
                if(row!=n-1&&grid[row+1][col]==1){
                    q.offer(new Pair(row+1,col));
                    grid[row+1][col]=2;
                    fresh--;
                }
                if(col!=0&&grid[row][col-1]==1){
                    q.offer(new Pair(row,col-1));
                    grid[row][col-1]=2;
                    fresh--;
                }
                if(col!=m-1&&grid[row][col+1]==1){
                    q.offer(new Pair(row,col+1));
                    grid[row][col+1]=2;
                    fresh--;
                }
            }
            minutes++;

        }
        if(fresh>0) return -1;
        
  return minutes;  }
}

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}