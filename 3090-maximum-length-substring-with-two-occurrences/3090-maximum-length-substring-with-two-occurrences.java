class Solution {
    public int maximumLengthSubstring(String s) {
        int[] a = new int[26];
        int j = 0, max = -1, n = s.length();

        for (int i = 0; i < n; i++) {

            a[s.charAt(i) - 'a']++;
            while (a[s.charAt(i)-'a'] > 2) {
                a[s.charAt(j++) - 'a']--;

            }
            max = Math.max(max, i - j + 1);

        }

        return max;
    }
}