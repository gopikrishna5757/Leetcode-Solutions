class Solution {
    public static int  findgcd(int a ,int b){
        if(b==0) return a;
        return findgcd(b,a%b);
    }
    public static int findlcm(int a ,int b){
        if(a==0||b==0) return 0;
        return (a/(findgcd(a,b))*b);
    }
    public int maxLength(int[] nums) {
        int n = nums.length,max=1;
        for(int i=0;i<n;i++){
            int prod=nums[i],gcd=nums[i],lcm=nums[i];
            for(int j=i+1;j<n;j++){
                prod*=nums[j];
                lcm=findlcm(lcm,nums[j]);
                gcd=findgcd(gcd,nums[j]);
                if(i==2) System.out.println(prod+" "+lcm+" "+gcd);
                if(prod==(lcm*gcd)) max=Math.max(max,j-i+1);
            }
        }
        
    return max;}
}