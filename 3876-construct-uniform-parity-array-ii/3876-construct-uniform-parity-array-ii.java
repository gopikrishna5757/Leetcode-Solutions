class Solution {
    public boolean uniformArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i % 2 != 0) {
                min = Math.min(min, i);
            }
        }
        if (min == Integer.MAX_VALUE)
            return true;
        for (int i : nums) {
            if (i % 2 == 0 && i < min) {
                return false;
            }

        }

        return true;
    }
}