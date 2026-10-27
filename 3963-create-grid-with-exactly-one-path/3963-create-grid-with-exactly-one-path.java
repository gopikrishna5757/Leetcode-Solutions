class Solution {
    public String[] createGrid(int m, int n) {
        String[] a= new String[m];
        int c=0;
        StringBuilder sb= new StringBuilder();
        while(m-->1){
            
            int k=n;
            sb.append(".");
            sb.append("#".repeat(n-1));
            a[c++]=sb.toString();
            sb.setLength(0);
           
        }
        sb.append(".".repeat(n));
        a[c]=sb.toString();
    return a;}
}