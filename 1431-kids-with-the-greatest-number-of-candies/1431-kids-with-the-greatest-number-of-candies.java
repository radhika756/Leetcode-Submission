class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int n=candies.length;
        int max=candies[0];
for(int i = 1; i < candies.length; i++) {
    max = Math.max(max, candies[i]);
}
        for(int i=0;i<n;i++){
            int val=candies[i]+extraCandies;
            if(val>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}