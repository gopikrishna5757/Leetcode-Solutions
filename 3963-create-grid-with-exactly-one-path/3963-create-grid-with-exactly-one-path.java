class Solution {
    public String[] createGrid(int m, int n) {
        String[] a= new String[m];
        int c=0;
        StringBuilder sb= new StringBuilder(".");
        sb.append("#".repeat(n-1));
        String s=sb.toString();
        while(m-->1){
            
          
            
            
            a[c++]=s;
           
           
        }
        sb.setLength(0);
        sb.append(".".repeat(n));
        a[c]=sb.toString();
    return a;}
}