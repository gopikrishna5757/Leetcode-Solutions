
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        int running = 0, c = 0;
        while (running < sum && num-- > 0) {
            if ((running + 9) < sum) {
                running += 9;
                sb.append(9);
            } else {

                sb.append(sum - running);
                running += sum - running;

            }

        }
        while (num-- > 0) {
            sb.append(0);
        }
        if (sum != running)
            return "";

        return sb.toString();
    }
}