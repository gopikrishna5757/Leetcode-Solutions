class Solution {
    public static int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if(sum==x) return n;
        int req = sum - x,run=0;
        int left = 0, right = 0, max=-1;
        while (right < n) {
            run += nums[right];
            while (left<right&&run > req) {
                run -= nums[left++];

            }
            if(run==req) max=Math.max(max,right-left+1);
            right++;
        }
        if(max==-1) return  -1;

   return n-max; }
   

}