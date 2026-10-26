 public class Pair{
    int gain;
    int rearr;
    int original;
    public Pair(int gain,int rearr,int original){
        this.gain=gain;
        this.rearr=rearr;
        this.original=original;
    }
}
class Solution {

    public int rearrange(int a) {

        char[] arr = String.valueOf(a).toCharArray();
        Arrays.sort(arr);

        return Integer.parseInt(
                new StringBuilder(new String(arr)).reverse().toString());

    }
    public long maximizeSum(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {

              return Integer.compare(b.gain,a.gain);
            
        });
        for (int i : nums) {
            int cur=rearrange(i);
            pq.add(new Pair(cur-i,cur,i));
        }

        long sum = 0;

        while (!pq.isEmpty() && k-- > 0) {
            sum +=pq.poll().rearr;
        }
        while (!pq.isEmpty()) {
            sum += pq.poll().original;
        }

        return sum;
    }
}//3,6,13,17,24