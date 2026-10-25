class Solution {
    public int maxDistance(int[] colors) {
        int ans=0;
        int n=colors.length;
        for(int i=n-1;i>=0;i--){
            if(colors[0]!=colors[i]){
               ans=Math.abs(i-0);
               break;
            }     
        }
        for(int i=0;i<n;i++){
            if(colors[n-1]!=colors[i]){
                int dis=n-1-i;
                ans=Math.max(ans,dis);
                break;
            }
        }
        return ans;
    }
}