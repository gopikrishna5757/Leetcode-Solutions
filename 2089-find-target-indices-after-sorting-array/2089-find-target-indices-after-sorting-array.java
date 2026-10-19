class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l= new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                l.add(i);
            }
        }
        
   return l; }
}