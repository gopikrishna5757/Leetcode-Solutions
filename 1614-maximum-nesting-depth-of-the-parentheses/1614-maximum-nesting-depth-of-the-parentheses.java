class Solution {
    public int maxDepth(String s) {
        int max=-1,c=0,n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                c++;
            }
            else if(s.charAt(i)==')'){
                c--;
            }
            max=Math.max(max,c);
        }
        
    return max;}
}