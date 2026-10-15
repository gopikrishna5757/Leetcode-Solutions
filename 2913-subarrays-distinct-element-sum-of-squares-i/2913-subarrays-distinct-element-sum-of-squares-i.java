class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size(),sum=0;
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<n;i++){
            s.clear();
            for(int j=i;j<n;j++){
                s.add(nums.get(j));
                sum+=s.size()*s.size();
                
            }
        }
        
    return sum;}
}