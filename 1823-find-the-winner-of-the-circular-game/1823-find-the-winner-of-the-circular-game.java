class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(i);
        }
      return solve(ans,k,0);
    }
    public static int solve( List<Integer> ans,int k,int i){
      if(ans.size()==1){
        return ans.get(0);
      }
      int index=(i+k-1)%ans.size();
      ans.remove(index);
      return solve(ans,k,index);
    }
}