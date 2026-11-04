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
    public List<List<String>> solve(int mat[][],List<List<String>> ans,int col,int n){
        //base case
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                String s="";
                for(int j=0;j<n;j++){
                    if(mat[i][j]==1){
                        s+='Q';
                    }
                    else s+='.';
                }
                temp.add(s);
            }
            ans.add(temp);
            return ans;
        }

        for(int i=0;i<n;i++){
            if(isValid(mat,i,col,n)){
                mat[i][col]=1;
                solve(mat,ans,col+1,n);
                mat[i][col]=0;
            }
            
        }
        return ans;
    }
    public List<List<String>> solveNQueens(int n) {
        int mat[][]=new int[n][n];
        List<List<String>> ans=new ArrayList<>();
        solve(mat,ans,0,n);
        return ans;
    }
}