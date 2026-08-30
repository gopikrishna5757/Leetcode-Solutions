class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int maxpos=0,minpos=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
              max=nums[i];
              maxpos=i;
            }
            if(nums[i]<min){
              min=nums[i];
              minpos=i;
            }
        }
        System.out.println(n);
        System.out.println(maxpos);
        System.out.println(max);
        System.out.println(minpos);
        System.out.println(min);
        int diff=0;
        if(minpos<=maxpos){
           diff= minpos+1+n-maxpos;
        }
        else{
            diff=maxpos+1+n-minpos;
        }
        int left=0,right=0;
        left=Math.max(minpos,maxpos);
        right=Math.min(minpos,maxpos);
        int total=0;
        total=Math.min(left+1,n-right);
        
    return Math.min(diff,total);}
}