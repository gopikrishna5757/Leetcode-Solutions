class Solution {
    public String reverseWords(String s) {
        int n = s.length(),i=0;
        List<String> a= new ArrayList<>();
        while(i<n){
            StringBuilder sb= new StringBuilder();
           while(i<n&&s.charAt(i)==' '){
            i++;
           }
           while(i<n&&s.charAt(i)!=' '){
            sb.append(s.charAt(i++));
           }
           if(sb.length()!=0) a.add(sb.toString());

           


        }
        int left=0,right=a.size()-1;
        while(left<right){
            String temp=a.get(left);
            a.set(left,a.get(right));
            a.set(right,temp);
            left++;
            right--;
        }
        StringBuilder sb=new StringBuilder();
        for(String res:a){
             sb.append(res);
             sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        

        
    return sb.toString();}
}