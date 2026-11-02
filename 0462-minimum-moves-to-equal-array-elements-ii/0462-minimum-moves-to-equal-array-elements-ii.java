class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        int p=nums[n/2],sum=0;
        for(int i:nums){
            sum+=Math.abs(i-p);
        }
        

        
    return sum;}
}