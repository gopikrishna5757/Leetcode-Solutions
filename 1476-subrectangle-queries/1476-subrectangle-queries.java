class SubrectangleQueries {
    int[][] rect;
    public SubrectangleQueries(int[][] rec) {
        int n = rec.length;
        int m = rec[0].length;
        rect= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rect[i][j]=rec[i][j];
            }
        }
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i=row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++){
                rect[i][j]=newValue;
            }
        }
        
    }
    
    public int getValue(int row, int col) {
        return rect[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */