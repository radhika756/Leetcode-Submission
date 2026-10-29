class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(nums);
        solve(ans,curr,nums,0);
        return ans;
    }
    public static void solve(List<List<Integer>>ans,List<Integer>curr,int[] nums,int i){
        //base case
        if(i==nums.length){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int ele:curr){
                    temp.add(ele);
                
            }
           if(!ans.contains(temp)){
             ans.add(temp);
           }
            return;
        }

        //include
        curr.add(nums[i]);
        solve(ans,curr,nums,i+1);

        //exclude
        curr.remove(curr.size()-1);
        solve(ans,curr,nums,i+1);
    }
}