class Solution {
    public boolean isValid(int[] nums,int mid, int k){
        int n=nums.length;
        int sum=0;
        int cnt=1;
        for(int i=0;i<n;i++){
            if(nums[i]+sum>mid){
                cnt++;
                sum=nums[i];
            }
            else sum+=nums[i];
        }
        return cnt<=k;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        if(k>n) return -1;
        int s=nums[0];
        int e=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            s=Math.max(s,nums[i]);
            e+=nums[i];
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(nums,mid,k)){
                ans=mid;
                e=mid-1;
            }
            else s=mid+1;
        }
        return ans;
    }
}