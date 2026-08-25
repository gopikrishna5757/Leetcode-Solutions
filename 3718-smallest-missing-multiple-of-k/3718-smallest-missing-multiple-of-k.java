class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s= new HashSet<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }
        for(int i=k;i<=200;i+=k){
            if(!s.contains(i)){
                return i;
            }
        }
        
   return k; }
}