class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int i=0,j=0;
        int c=0;
        StringBuilder sb= new StringBuilder();
        while(j<n){
            System.out.println(s.substring(i,j+1));
            if(s.charAt(j)=='1'){
                c++;

            }
            while(c>k){
               
                if(s.charAt(i)=='1'){
                    c--;
                    
                }
                i++;
            }
            while(c==k&&s.charAt(i)=='0'){
                i++;
            }
            if(c==k){
                String cur=s.substring(i,j+1);
                
                if(sb.length()==0){
                    sb.append(s.substring(i,j+1));
                }
              
                else if(sb.length()>cur.length()){
                    sb.setLength(0);
                    sb.append(cur);
                 
                    

                }
                else if(cur.length()==sb.length()){
                       if(cur.compareTo(sb.toString())<0){
                        sb.setLength(0);
                        sb.append(cur);
                    }
                 
                }
            }
            j++;
            
        }
       
        
        
   return sb.toString(); }
}