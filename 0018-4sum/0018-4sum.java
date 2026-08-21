class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
               
                int left = j+ 1, right = n-1;
                while (left < right) {
                    long sum=(long)((long)nums[i] + (long)nums[j] +(long) nums[left] + (long)nums[right]);
                    if ( sum== target) {
                        res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));
                        left++;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }

                }
            }

        }

        return new ArrayList<>(res);
    }
}