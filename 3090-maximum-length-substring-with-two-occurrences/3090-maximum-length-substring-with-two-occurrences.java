class Solution {
    public int maximumLengthSubstring(String s) {
        int[] a= new int[26];
        int j=0,max=-1;
        int n = s.length();
        
        for(int i=0;i<n;i++){
            int m=s.charAt(i)-'a';
            a[m]++;
            while(a[m]>2){
                a[s.charAt(j)-'a']--;
                j++;
            }
        max=Math.max(max,i-j+1);
             
        }
        
   return max; }
}