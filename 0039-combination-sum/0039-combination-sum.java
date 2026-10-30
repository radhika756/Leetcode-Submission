class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        solve(ans,curr,arr,t,0);
        return ans;
    }
    public void solve( List<List<Integer>> ans,List<Integer> curr,int[] arr, int t,int i){
        //base case
        if(t<0) return;
        if(t==0){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int ele:curr){
                temp.add(ele);
            }
            ans.add(temp);
            return;
        }
        for(int j=i;j<arr.length;j++){
            curr.add(arr[j]);
            solve(ans,curr,arr,t-arr[j],j);
            curr.remove(curr.size()-1);
        }
    }
}