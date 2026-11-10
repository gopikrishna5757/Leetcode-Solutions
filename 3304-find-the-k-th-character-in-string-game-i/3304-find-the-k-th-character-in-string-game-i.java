class Solution {

    public char kthCharacter(int k) {
        int temp=k;
        return find(k,"a",temp);
    }
    public static char find(int k,String ch,int temp){
        if(k==1||ch.length()>=temp) return ch.charAt(temp-1);
        StringBuilder sb= new StringBuilder();
        
        for(int i=0;i<ch.length();i++){
            char c=ch.charAt(i);
            if(c=='z'){
                sb.append("a");
            }
            else{
                sb.append((char)(c+1));
            }
            
            
        }
        ch=ch+sb.toString();
        return find(k-1,ch,temp);
        
    }

}