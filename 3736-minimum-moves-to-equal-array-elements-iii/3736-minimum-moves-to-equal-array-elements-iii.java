class Solution {
    public int minMoves(int[] nums) {
        int  sum=0,max=-1;
        for(int i:nums){
            max=Math.max(max,i);
        }
        for(int i:nums){
            sum+=max-i;
        }
        
    return sum;}
}