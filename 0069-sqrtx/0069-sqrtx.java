class Solution {
    public int mySqrt(int n) {
      if(n==0) return 0;
      int s=1,e=n,ans=-1;
      while(s<=e){
        int m = s+(e-s)/2;

        if(m==n/m) return m;
        
        else if(m<n/m){ ans=m;
        s=m+1;
        }
        else e=m-1;
      } 
      return ans; 
    }
}