class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        int n = nums.size();
        for (int i = l; i <= r; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += nums.get(j);
            }
            if (sum > 0 && sum < ans) {

                ans = sum;
            }
            
            for (int j = 0; j < n - i; j++) {
                sum -= nums.get(j);
                sum += nums.get(j + i);
                if (sum > 0 && sum < ans) {

                    ans = sum;
                }

            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;
    }
}