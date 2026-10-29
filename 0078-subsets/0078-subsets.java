class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        solve(ans,curr,nums,0);
        return ans;
    }
    public static void solve(List<List<Integer>>ans, ArrayList<Integer> curr,int[] nums,int i){
        //base case
        if(i==nums.length){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int ele:curr){
                temp.add(ele);
            }
            ans.add(temp);
            return;
        }
        //Include
        curr.add(nums[i]);
        solve(ans,curr,nums,i+1);
        //Exclude
        curr.remove(curr.size()-1);
        solve(ans,curr,nums,i+1);
    }
}