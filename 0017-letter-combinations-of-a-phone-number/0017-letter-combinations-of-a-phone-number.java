class Solution {
    String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String d) {
         List<String> ans=new ArrayList<>();
         String curr="";
         solve(ans,curr,d,0);
         return ans;
    }
    public void solve( List<String>ans, String curr,String d,int i){
        //base case
        if(i==d.length()){
            ans.add(curr);
            return;
        }
        String val=map[d.charAt(i)-'0'];//abc

        
        for(char ch:val.toCharArray()){
            solve(ans,curr+ch,d,i+1);
        }
    }
}