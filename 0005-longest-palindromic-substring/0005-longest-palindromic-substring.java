class Solution {
    
    public static String is(int left,int right,String s){
        int n =s.length();
        while(left>=0&&right<n&&s.charAt(left)==s.charAt(right)){
          
            left--;
            right++;
        }
        left++;
        right--;
        return s.substring(left,right+1);
        
       
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            String s1=is(i,i,s);
            String s2=is(i,i+1,s);
            if(s1.length()>s2.length()&&s1.length()>ans.length()){
                ans=s1;
            }
            else if(s2.length()>ans.length()){
                ans=s2;
            }
            
            
        }
       
      

        
    return ans;}
}