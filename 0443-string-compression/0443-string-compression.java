class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int c = 1, k = 0;
        for (int i = 1; i < n; i++) {
            if (chars[i] != chars[i - 1]) {
                String st = String.valueOf(c);
                chars[k++] = chars[i - 1];
                if (c > 1) {
                    for (char ch : st.toCharArray()) {
                        chars[k++] = ch;

                    }
                }

                c = 1;
            } else {
                c++;
            }

        }
        String st = String.valueOf(c);
        chars[k++] = chars[n - 1];
        if (c > 1) {
            for (char ch : st.toCharArray()) {
                chars[k++] = ch;

            }
        }

        return k;
    }
}