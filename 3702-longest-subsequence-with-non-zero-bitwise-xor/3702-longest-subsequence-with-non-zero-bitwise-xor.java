class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int sum=0;
        boolean flag=false;
        for(int i:nums){
            sum^=i;
            if(i!=0){
                flag=true;
            }

        }
        if(sum!=0){
            return n;
        }
        if(flag) return n-1;

    return 0;}
}