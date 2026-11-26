class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> p= new PriorityQueue<>((a,b)->{
            return Integer.compare(b[1],a[1]);
        });
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            map.put(i,(map.getOrDefault(i,0))+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){

            p.add(new int[]{e.getKey(),e.getValue()});
        }
        int[] res= new int[k];
        int c=0;
        while(k-->0){
            int[] s=p.poll();
            res[c++]=s[0];

        }



        
    return res;}
}
