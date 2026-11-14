class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        int n = nums.size();
        int[] pre = new int[n];
        pre[0]=nums.get(0);
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums.get(i);
        }
        for(int i=l;i<=r;i++){
            int sum=pre[i-1];
            if(sum>0&&sum<ans) ans = sum;
            for(int j=i;j<n;j++){
                 sum=pre[j]-pre[j-i];
                if(sum>0&&sum<ans) ans =sum;
            }
        }
        if(ans == Integer.MAX_VALUE) return -1;
        

        return ans;
    }
}