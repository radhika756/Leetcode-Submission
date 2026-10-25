class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int column = matrix [0].length;
        int temp [][] = new int [column] [row];
        for(int i=0 ; i < matrix.length ; i++){
            for(int j=0 ; j < matrix[0].length ; j++){
                temp [j] [i] = matrix [i] [j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               matrix[i][j]=temp[i][j];
            }
        }
        for( int i=0 ; i < row ; i++){
            int j=0,k = matrix.length-1;
            while(j<k){
                int copy  = matrix [i][j];
                matrix [i][j] = matrix [i][k];
                matrix [i][k] = copy;
                j++;
                k--;
            }
        }
        for(int i=0;i<row;i++){
        System.out.print(Arrays.toString(matrix[i]));
    }
    }
}