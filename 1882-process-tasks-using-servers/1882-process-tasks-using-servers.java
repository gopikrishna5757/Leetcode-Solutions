 class Pair{
    
    int ind;
    int time;
     Pair(int ind,int time){
        
        this.ind=ind;
        this.time=time;
    }
}
class Solution {
    
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length, m = tasks.length,t=0;
        int[] ans = new int[m];
        PriorityQueue<Integer> pqs= new PriorityQueue<>((a,b)->{
            if(servers[a]!=servers[b]){
                return Integer.compare(servers[a],servers[b]);
            }
            
            return Integer.compare(a,b);

        });
        for(int i=0;i<n;i++){
            pqs.add(i);
        }
        PriorityQueue<Pair> pqp= new PriorityQueue<>((a,b)->{
            if(a.time!=b.time) return Integer.compare(a.time,b.time);
            if(servers[a.ind]!=servers[b.ind]) return Integer.compare(servers[a.ind],servers[b.ind]);
            return Integer.compare(a.ind,b.ind);
            
        });
        for(int i=0;i<m;){
            t=Math.max(t,i);
            while(!pqp.isEmpty()&&pqp.peek().time<=t){
                pqs.offer(pqp.poll().ind);
            }
            if(pqs.isEmpty()){
                t=pqp.peek().time;
                continue;
            }
            
                int index=pqs.poll();
                Pair p = new Pair(index,t+tasks[i]);
                pqp.offer(p);
                ans[i]=index;
                i++;

            
            
            


            
            
            
        }


        
        
        
    return ans;}
}