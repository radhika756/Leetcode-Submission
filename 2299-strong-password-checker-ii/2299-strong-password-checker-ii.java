class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
       
            boolean islower=false;
            boolean isUpper=false;
            boolean isdigit=false;
            String s="!@#$%^&*()-+";
            boolean isspecial=false;
            for(int i=0;i<password.length();i++){
                if(i<password.length()-1 && password.charAt(i)==password.charAt(i+1)) return false;
                else{
                char ch = password.charAt(i);
                if(Character.isLowerCase(ch)) islower=true;
                if(Character.isUpperCase(ch)) isUpper=true;
                if(Character.isDigit(ch)) isdigit=true;
                if(s.indexOf(ch)!=-1)  isspecial=true;





                }

            }
        
       return islower && isUpper && isdigit && isspecial;
    }
}