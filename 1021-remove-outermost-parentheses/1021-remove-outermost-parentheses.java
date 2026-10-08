class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb= new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                
                int c=1;
               
                if(s.charAt(i+1)=='('){
                   i++;
                   
                    while(c>=1){
                     if(s.charAt(i)=='('){
                        c++;
                     }
                     else{
                        c--;
                     }
                     if(c<1) break;
                     sb.append(s.charAt(i));
                     i++;
                    
                   }
                }
               
            }
            
            
        }
        
   return sb.toString(); }
}