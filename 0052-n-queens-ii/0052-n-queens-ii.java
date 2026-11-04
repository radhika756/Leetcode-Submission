class Solution {
     public boolean isValid(int mat[][],int row,int cl,int n){
        int i=row;
        int j=cl;
        //backword
        while(j>=0){
            if(mat[i][j]==1) return false;
            else j--;
        }

        //upper diagonal
        i=row;
        j=cl;
        while(i>=0 && j>=0){
            if(mat[i][j]==1) return false;
            else {
                i--;
                j--;
            }
        }

        //lower diagonal
        i=row;
        j=cl;
        while(i<n && j>=0){
            if(mat[i][j]==1) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public int solve( int mat[][],int col,int n){
        if(col==n){
            return 1;
        }
        int count=0;
        for(int i=0;i<n;i++){
           if(isValid(mat,i,col,n)){
            mat[i][col]=1;
            count+=solve(mat,col+1,n);
            mat[i][col]=0;
           }
        }
        return count;
    }
    public int totalNQueens(int n) {
        int mat[][]=new int[n][n];
       return solve(mat,0,n);
    }
}