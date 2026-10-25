class Solution {
    public void sortColors(int[] arr) {
       // l h and m(for iteration..)
       // Dutch national algorithm
       int l=0;
       int h=arr.length-1;
       int m=0;
       while(m<=h){
        if(arr[m]==2){
       swap(arr,m,h--);
        }
        else if(arr[m]==0){
            swap(arr,m++,l++);
        }
        else{
            m++;

        }
       }
    }
    public static void swap(int[]arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}