class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        else{
            s=s+s;
            return s.contains(goal);
        }
    }
}