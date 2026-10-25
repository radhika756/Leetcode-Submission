class Solution {
    public String removeDigit(String s, char d) {
       int lastIndex=-1;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==d ){
            lastIndex=i;
        }
        if(i<s.length()-1 && s.charAt(i)==d && s.charAt(i)<s.charAt(i+1)){
            String num1=s.substring(0,i);
            String num2=s.substring(i+1);
            return num1+num2;
        }}
        if(lastIndex!=-1){
        return s.substring(0,lastIndex)+ s.substring(lastIndex+1);

        }
        return "";
    }
}