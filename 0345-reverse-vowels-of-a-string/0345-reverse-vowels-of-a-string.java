class Solution {
    public String reverseVowels(String s) {
        int  n= s.length();
        int i=0,j=n-1;

        char[] arr= s.toCharArray();   
        while(i<=j){
            while(i<j&&!("aeiou".indexOf(arr[i])!=-1)&&!("AEIOU".indexOf(arr[i])!=-1)){
                i++;
            }
            while(i<j&&!("aeiou".indexOf(arr[j])!=-1)&&!("AEIOU".indexOf(arr[j])!=-1)){
                j--;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

   return new String(arr); }
}