class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a= new int[101];
        int n = nums.length;
        for(int i:nums){
            a[i]++;
        }
        for(int j=0;j<n;j++){
            int sum=0;
            for(int i=nums[j]-1;i>=0;i--){
                sum+=a[i];
            }
            nums[j]=sum;
        }
        
    return nums;}
}