class Solution {
    public static boolean valid(StringBuilder sb){
        int c=0;
        for(int i=0;i<sb.length();i++){
            char ch =sb.charAt(i);
            if(ch=='('){
                c++;
            }
            else{
                c--;
            }
            if(c<0) return false;
        }
        return c==0;
    }
    public static void genarate(StringBuilder sb,List<String> l,int n ){
        if(n<=0){
            if(valid(sb)){
                l.add(sb.toString());
            }
            return ;
        }
        sb.append("("); 
        genarate(sb,l,n-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append(")");
        genarate(sb,l,n-1);
        sb.deleteCharAt(sb.length()-1);

    }

    public List<String> generateParenthesis(int n) {
        StringBuilder sb= new StringBuilder();
        List<String> l= new ArrayList<>();
        genarate(sb,l,n*2);
        
   return l; }
}