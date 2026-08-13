class Solution {
    static void mergesort(int[] nums,int low,int high,int n){
        if(low==high) return ;
        int mid=low+(high-low)/2;
        mergesort(nums,low,mid,n);
        mergesort(nums,mid+1,high,n);
        merge(nums,low,mid,high);
    }
    static void merge(int[] nums,int low,int mid,int high){
        int p1=low,p2=mid+1,k=0;
        int[] a= new int[high-low+1];
        while(p1<=mid&&p2<=high){
            if(nums[p1]<nums[p2]){
                a[k++]=nums[p1++];
            }
            else{
                a[k++]=nums[p2++];
            }
        }
        while(p1<=mid){
            a[k++]=nums[p1++];
        }
         while(p2<=high){
            a[k++]=nums[p2++];
        }
        int m=0;
        for(int i=low;i<=high;i++){
            nums[i]=a[m++];
        }

    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        

        mergesort(nums,0,n-1,n);
        
   return nums; }
}