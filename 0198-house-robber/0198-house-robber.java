class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
       
        int max=Math.max(nums[0],nums[1]);
        int left=nums[0];
        for(int i=2;i<n;i++){
          int  res=Math.max(max,nums[i]+left);
          left=max;
          max=res;
        }
        
   return max; }
}