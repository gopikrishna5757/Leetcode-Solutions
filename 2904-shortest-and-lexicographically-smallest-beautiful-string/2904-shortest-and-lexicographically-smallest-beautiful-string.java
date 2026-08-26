class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int i = 0, ones = 0;
        String ans = "";

        for (int j = 0; j < n; j++) {

            if (s.charAt(j) == '1') {
                ones++;
            }

            // More than k ones
            while (ones > k) {
                if (s.charAt(i) == '1') {
                    ones--;
                }
                i++;
            }

            // Remove leading zeros
            while (ones == k && s.charAt(i) == '0') {
                i++;
            }

            if (ones == k) {
                String current = s.substring(i, j + 1);

                if (ans.isEmpty()
                        || current.length() < ans.length()
                        || (current.length() == ans.length()
                            && current.compareTo(ans) < 0)) {

                    ans = current;
                }
            }
        }

        return ans;
    }
}