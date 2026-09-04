class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] a= new int[n];
        int pre=nums[0],suf=nums[n-1];
        int[] b= new int[n];
        b[0]=pre;
        a[n-1]=suf;
        for(int i=1;i<n;i++){
            pre=Math.max(pre,nums[i]);
            suf=Math.min(suf,nums[n-i-1]);
            b[i]=pre;
            a[n-i-1]=suf;
        }
        
      
        for(int i=0;i<n;i++){
            if((b[i]-a[i])<=k){
                return i;
            }
        }
     
      
        
   return -1; }
}