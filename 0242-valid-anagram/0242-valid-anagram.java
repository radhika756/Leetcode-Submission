class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int [] str=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            str[ch-'a']=str[ch-'a']+1;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            str[ch-'a']=str[ch-'a']-1;
        }
        for(int i=0;i<str.length;i++){
            if(str[i]!=0) return false;
        }
        return true;
    }
}