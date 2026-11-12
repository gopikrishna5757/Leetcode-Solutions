class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int c1=1,c2=1,max1=1,max2=1;
        int n= nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){

                c1++;
                max1=Math.max(c1,max1);
            }
            else{
                c1=1;
            }
            if(nums[i]<nums[i-1]){

                c2++;
                max2=Math.max(c2,max2);
            }
            else{
                c2=1;
            }
        }
        
   return Math.max(max1,max2); }
}