class Solution {
    public void rotate(int[] arr, int k) {
        if(k<0) k+=arr.length;
        k=k%arr.length;
         swap(0,arr.length-1,arr);  
        swap(0,k-1,arr);
        swap(k,arr.length-1,arr);
    }
    public void swap(int i,int j,int[]arr){
        while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;j--;
        }
    }
}