class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int j=0;
        int max=-1;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
           else if(map.get(nums[i])<k){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                
            }

            else{
                while(map.get(nums[i])>=k){
                    System.out.println(nums[j]);
                    if(map.get(nums[i])>0){
                         map.put(nums[j],map.get(nums[j])-1);
                    }
                    else{
                        map.remove(nums[j]);

                    }
                    j++;
                    
                }
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            }
            max=Math.max(max,i-j+1);

        }
       
   return max; }
}