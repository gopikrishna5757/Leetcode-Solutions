class Solution {
    public String evaluate(String s, List<List<String>> Knowledge) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        Map<String,String> map = new HashMap<>();
        for (List<String> run : Knowledge) {
            map.put(run.get(0), run.get(1));
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                i++;
                while (i < n && s.charAt(i) != ')') {
                    sb.append(s.charAt(i++));
                }
            } else {
                while (i < n && s.charAt(i) != '(') {
                    res.append(s.charAt(i++));
                }
                i--;

            }
            if (sb.length() != 0) {
                String cur = sb.toString();
                if(map.containsKey(cur)){
                    res.append(map.get(cur));
                }
                else {
                    res.append("?");
                }
                sb.setLength(0);
            }

        }

        return res.toString();
    }
}