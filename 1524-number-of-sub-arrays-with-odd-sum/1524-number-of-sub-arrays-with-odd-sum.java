class Solution {
    public int numOfSubarrays(int[] arr) {
        int even=1,odd=0,sum=0,c=0,m=1000000007;
        for(int i:arr){
            sum=(sum+i)%2;
            if(sum==1){
                c=(c+even)%m;
                odd++;
            }
            else{
                c=(c+odd)%m;
                even++;
            }
        }
        
   return (int)c; }
}