class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int j=0,k=image.length-1;
            while(j<k){
                int temp=image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=temp;
                j++;
                k--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                image[i][j]=image[i][j]==0?1:0;
            }
        }
        return image;
    }
}