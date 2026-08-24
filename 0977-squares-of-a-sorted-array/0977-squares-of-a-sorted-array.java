class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=(nums[i]*nums[i]);
        }
        int i=0,j=n-1;
        int k=n-1;
        while(i<=j){
            if(nums[i]>nums[j]){
              a[k--]=nums[i++];
            }
            else{
                a[k--]=nums[j--];
            }
        }

        
    return a;}
}