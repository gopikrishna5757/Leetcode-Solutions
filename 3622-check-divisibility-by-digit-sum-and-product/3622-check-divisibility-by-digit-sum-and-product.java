class Solution {
    public boolean checkDivisibility(int n) {
           int temp=n;
           int digitsum=0;
           int prod=1;
           while(n>0){
               digitsum+=n%10;
               prod*=n%10;
               n/=10;
           }      
   return (temp%(prod+digitsum)==0); }
}