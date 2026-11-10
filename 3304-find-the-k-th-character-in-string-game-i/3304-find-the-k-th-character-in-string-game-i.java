class Solution {

    public char kthCharacter(int k) {
        int temp=k;
        return find(k,"a",temp);
    }
    public static char find(int k,String ch,int temp){
        if(k==1||ch.length()>=temp) return ch.charAt(temp-1);
        
        String s="";
        for(int i=0;i<ch.length();i++){
            char c=ch.charAt(i);
            if(c=='z'){
              s=s+"a";  
            }
            else{
                s=s+(char)(c+1);
            }
            
            
        }
        ch=ch+s;
        return find(k-1,ch,temp);
        
    }

}