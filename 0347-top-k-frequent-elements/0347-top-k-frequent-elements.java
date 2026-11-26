class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> p= new PriorityQueue<>((a,b)->{
            return Integer.compare(b.a2,a.a2);
        });
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            map.put(i,(map.getOrDefault(i,0))+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            p.add(new Pair(e.getKey(),e.getValue()));
        }
        int[] res= new int[k];
        int c=0;
        while(k-->0){
            Pair s=p.poll();
            res[c++]=s.a1;

        }



        
    return res;}
}
class Pair{
    int a1;
    int a2;
    Pair(int a1,int a2){
        this.a1=a1;
        this.a2=a2;
    }
}