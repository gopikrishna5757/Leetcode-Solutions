class Solution {
    static class Pair{
        int ind;
        int val;
        Pair(int ind,int val){
            this.ind=ind;
            this.val=val;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        PriorityQueue<Pair> q= new PriorityQueue<>((a,b)->{
            if(a.val!=b.val){
                return Integer.compare(a.val,b.val);
            }
            return Integer.compare(a.ind,b.ind);
        });
        int c=0;
        for(int i:nums){
              q.offer(new Pair(c++,i));
        }
        while(k-->0){
            Pair p=q.poll();
            p.val=multiplier*p.val;
            q.offer(p);
        }
        for(Pair p:q){
           
            nums[p.ind]=p.val;
        }
        
   return nums; }
}