class Solution {
    public static boolean isPalindrome(String s,int left,int right){
         if(left<0||right>s.length()-1) return true;
        if(s.charAt(left)!=s.charAt(right)) return false;
       
        return isPalindrome(s,left-1,right+1);
    }
    public boolean isPalindrome(String s) {
        int m=s.length();
        boolean flag= false;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<m;i++){
            int t=s.charAt(i);
            if(t<=90&&t>=65){
                sb.append((char)(t^32));
            }else if(t>=97&&t<=122||t>=48&&t<=57){
               sb.append((char)(t)); 
            }
           
        }
        int left, right,n=sb.length();
        if(n%2==0){
             left=n/2-1;
             right=n/2;
        }
        else{
            left=n/2;
            right=n/2;
        }
        
        
  return isPalindrome(sb.toString(),left,right);  }
}