class Solution {
    public int countAsterisks(String s) {
        int cb=0;
        int a=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='|'){
                cb++;
            }
            else if(s.charAt(i)=='*'&& cb%2==0){
            a++;
            }
        }
        return a;
    }
}