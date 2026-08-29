class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            swap(i, n - i - 1, nums);
        }
        k = k % n;
        for (int i = 0; i < (k/2); i++) {
            swap(i,k-i-1, nums);
        }
        for (int i =  k; i < ((n+k)/ 2); i++) {
            swap(i, n - i + k-1, nums);
        }

    }

    static void swap(int i, int j, int[] nums) {
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}