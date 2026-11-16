class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k){
            return s;
        }
       int n = s.length();
       List<Integer> l= new ArrayList<>();
       int sum=0;
       for(int i=0;i<n;i++){
          sum+=s.charAt(i)-'0';
          if((i+1)%k==0||i==n-1){
              l.add(sum);
              sum=0;
          }  

       }
       StringBuilder sb= new StringBuilder();
       for(Integer i:l){
        sb.append(i);
       }
       return digitSum(sb.toString(),k);
        
    }
}