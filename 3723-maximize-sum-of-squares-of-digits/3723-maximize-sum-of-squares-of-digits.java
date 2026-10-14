class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if((num*9)<sum) return "";
        StringBuilder sb = new StringBuilder();
        int nine=sum/9, r = sum%9;
        sb.repeat("9",nine);
        if(r>0) sb.append(r);
        int z=num-sb.length();
        sb.repeat("0",z);
        return sb.toString();
        
       
    }
}