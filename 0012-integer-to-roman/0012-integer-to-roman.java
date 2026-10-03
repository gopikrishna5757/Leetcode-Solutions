class Solution {
    public String intToRoman(int n) {
        StringBuilder sb = new StringBuilder();
        int m=0,d=0,c=0,l=0,x=0,v=0,i=0;
        m=n/1000;
        n%=1000;
        sb.append(String.valueOf('M').repeat(m));
        if(n>=900&&n<1000){
           sb.append(String.valueOf("CM"));
           n-=900;
        }
        else{
            
             d=n/500;
            n%=500;
            sb.append(String.valueOf('D').repeat(d));

        }
        if(n>=400&&n<500){
            sb.append(String.valueOf("CD"));
            n-=400;
        }
        else{
             c=n/100;
        n%=100;
        sb.append(String.valueOf('C').repeat(c));
        }
        if(n>=90&&n<100){
            sb.append(String.valueOf("XC"));
            n-=90;
        }
        else{
             l=n/50;
             n%=50;
             sb.append(String.valueOf('L').repeat(l));
        }
        if(n>=40&&n<50){
            sb.append(String.valueOf("XL"));
            n-=40;
        }
        else{
             x=n/10;
            n%=10;
            sb.append(String.valueOf('X').repeat(x));
        }
        if(n>=9&&n<10){
            sb.append(String.valueOf("IX"));
            n-=9;
        }
        else{
              v=n/5;
              n%=5;
              sb.append(String.valueOf('V').repeat(v));
        }
        if(n==4){
           sb.append(String.valueOf("IV"));
           n-=4;
        }
        else{
           sb.append(String.valueOf('I').repeat(n));
        }
        
        
        
       
      
        
        
        
       
        
     


        
   return sb.toString(); }
}