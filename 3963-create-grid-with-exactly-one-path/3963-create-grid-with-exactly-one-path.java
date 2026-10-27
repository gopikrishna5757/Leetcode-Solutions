class Solution {
    public String[] createGrid(int m, int n) {
        String[] a = new String[m];
        int c = 0,k=n;
        String s = ".";
        for (int i = 1; i < n; i++) {
            s += "#";
        }
        while (m-- > 1) {

            a[c++] = s;

        }
        String ss = ".";
        for (int i = 1; i < k; i++) {
            ss +=".";
        }
        a[c] = ss;

        return a;
    }
}