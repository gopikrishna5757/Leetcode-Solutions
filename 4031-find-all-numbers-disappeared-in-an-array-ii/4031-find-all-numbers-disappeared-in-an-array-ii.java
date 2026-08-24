class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Set<Integer> s= new HashSet<>();
        int  n= nums.length;
        for(int i=0;i<n;i++){
             s.add(nums[i]);
        }
        List<List<Integer>> res= new ArrayList<>();
       
        int  fm=-1,lm=-1;
        for(int i=lower;i<=upper;i++){
            if(!s.contains(i)&&fm==-1){
                fm=i; 
            }
            if(s.contains(i)&&fm!=-1){
                res.add(new ArrayList<>(Arrays.asList(fm,lm)));
                fm=-1;
            }
            if(!s.contains(i)) lm=i;
           
        }
        if(fm!=-1) res.add(new ArrayList<>(Arrays.asList(fm,lm)));
        
   return res; }
}