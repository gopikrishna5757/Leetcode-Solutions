class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        //int ind=-1;
        int[] ss= new int[n];
        int min=nums[n-1];
        ss[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            min=Math.min(min,nums[i]);
            ss[i]=min;
        }
        
        int  max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            
            
            max=Math.max(max,nums[i]);
            
            if((max-ss[i])<=k){
                return i;
            }
            
        }
        
   return -1; }
}