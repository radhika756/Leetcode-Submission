class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int n=arr.length;
        List<Integer> list = new ArrayList<>();
        cyclicsort(arr); 
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                list.add(arr[i]);
            }
        }  
        return list;     
    }
    public static void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int crtIndex=arr[i]-1;
             if( arr[i]!=arr[crtIndex]){
                swap(arr,i,crtIndex);
            }
            else i++;
        }
    }
    public static void swap(int []arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}