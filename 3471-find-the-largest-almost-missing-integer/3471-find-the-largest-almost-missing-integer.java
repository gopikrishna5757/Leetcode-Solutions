class Solution {

    public int largestInteger(int[] nums, int k) {
        int n =nums.length;
       
        int[] noc=new int[51];
        int[] win=new int[51];

        
        //if(n==k&&n!=1) return -1;
        for(int i=0;i<k;i++){
            win[nums[i]]++;
           
        }

        for(int i=0;i<51;i++){
            if(win[i]>0){
                noc[i]++;
            }
        }
        for(int i=0;i<n-k;i++){
            win[nums[i]]--;
            win[nums[i+k]]++;
            for(int j=0;j<51;j++){
            if(win[j]>0){
                noc[j]++;
            }
        }

        }
       // int max=-1;
        for(int i=50;i>=0;i--){
            if(noc[i]==1){
                return i;
            }

        }
        
        
        
   return -1; }
}