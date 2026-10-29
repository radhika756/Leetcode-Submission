class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        solve(ans,nums,0);
        return ans;
    }
    public static void solve(List<List<Integer>> ans,int[] nums,int i){
        int n=nums.length;
        if(i==(n-1)){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int ele:nums) temp.add(ele);
            if(!ans.contains(temp)){
                ans.add(temp);
            }
            return;
        }
        for(int j=i;j<nums.length;j++){
        swap(nums,i,j);
        solve(ans,nums,i+1);
        swap(nums,i,j);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}