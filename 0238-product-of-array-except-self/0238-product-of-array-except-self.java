class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int right = 1, left = 1;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
        }

        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            nums[i] = left;
            left *= temp;

        }
        for(int i=n-1;i>=0;i--){
               nums[i]*=right;
               right*=a[i];
        }
       

        return nums;
    }
}