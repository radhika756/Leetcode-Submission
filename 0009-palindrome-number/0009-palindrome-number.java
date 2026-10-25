class Solution {
    public boolean isPalindrome(int n) {
    boolean istrue=false;
     int copy=n;
     int rev=0;
     while(n>0){
        int lastdigit=n%10;
        rev=rev*10+lastdigit;
        n=n/10;
     }
     if(copy==rev){
        istrue=true;
     }
     return istrue;
    }
}