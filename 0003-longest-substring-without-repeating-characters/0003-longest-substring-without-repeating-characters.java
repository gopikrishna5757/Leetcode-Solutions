class Solution {

    public int lengthOfLongestSubstring(String s) {
        int  n=s.length();
        if(n==0) return 0;
        int[]  a= new int[128];
        int right=0,left=0,max=-1;
        while(right<n){
            a[s.charAt(right)]++;
            while(a[s.charAt(right)]>1){
                a[s.charAt(left)]--;
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;

        }
       
    
        return max;

        
    }
}