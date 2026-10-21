class Solution {
    public static boolean issorted(String s){
        int n = s.length();
        for(int i=1;i<n;i++){
            if((s.charAt(i)-'a')<(s.charAt(i-1)-'a')){
                return false;
            }
        }
        return true;
    }
    public static boolean prefix(int m,int n,String s){
       // int n = s.length();
        for(int i=0;i<n-1;i++){
            if((s.charAt(i)-'a')==m){
                return false;
            }
        }
        return true;
    }
    public static boolean suff(int m,int n ,String s
    ){
        //int n = s.length();
        for(int i=1;i<n;i++){
            if((s.charAt(i)-'a')==m){
                return false;
            }
        }
        return true;
    }

    public int minOperations(String s) {
        int n = s.length();
        if(n==1||issorted(s)) return 0;
        if(n==2&&!issorted(s)) return -1;
        int lmax=-1,rmin=10000;
        for(int i=0;i<n-1;i++){
            lmax=Math.max(lmax,s.charAt(i)-'a');
        }
        for(int i=1;i<n;i++){
            rmin=Math.min(rmin,s.charAt(i)-'a');
        }
        if(lmax<=s.charAt(n-1)-'a') return 1;
        if(rmin>=s.charAt(0)-'a') return 1;
        if(prefix(rmin,n,s)&&suff(lmax,n,s)) return 3;

        return 2;

        
    }
    //edc card
}