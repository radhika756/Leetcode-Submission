class Solution {
    public boolean isValid(int[] bloomDay,int m,int mid,int k){
        int fl=0;
        int bq=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                fl++;
            }
            else fl=0;
            if(fl==k){
                bq++;
                fl=0;
            }
        }
       return bq>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(k>bloomDay.length) return -1;
        int s=0;
        int e=0;
        int ans=-1;
        for(int i=0;i<bloomDay.length;i++){
            s=Math.min(s,bloomDay[i]);
            e=Math.max(e,bloomDay[i]);
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(bloomDay,m,mid,k)){
                ans=mid;
                e=mid-1;
            }
            else s=mid+1;
        }
        return ans;
    }
}