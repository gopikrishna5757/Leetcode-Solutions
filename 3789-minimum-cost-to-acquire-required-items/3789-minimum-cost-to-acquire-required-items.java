class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long min=(long)Math.min(costBoth,cost1+cost2)*Math.min(need1,need2);
        if(need1>need2){
            min+=(long)Math.min(costBoth,cost1)*(need1-need2);
        }
        else{
            min+=(long)Math.min(costBoth,cost2)*(need2-need1);
        }
        return min;
       
    }
}
/*long min=Long.MAX_VALUE;
        if(cost1<cost2){
            min=Math.min(min,cost1*)
        }
        min= Math.min((cost1*need1)+(cost2*need2),Math.max(need1,need2)*costBoth);  
  */      