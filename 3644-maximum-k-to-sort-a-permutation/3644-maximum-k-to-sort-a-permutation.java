class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int ans =0;
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(flag&&nums[i]!=i){
                ans=nums[i];
                flag=false;
            }
            else if(nums[i]!=i){
                  ans &= nums[i];
            }
           
        }     
    return ans;}
}