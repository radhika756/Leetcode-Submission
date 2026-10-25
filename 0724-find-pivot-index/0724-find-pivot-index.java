class Solution {
    public int pivotIndex(int[] nums) {
     // right ke liye array banao
     // left ke liye variable.... 
     int []arr=new int[nums.length];
     int sum =0;
     for(int i=nums.length-1;i>=0;i--){
        sum+=nums[i];
        arr[i]=sum;
     }  
     int left=0;
     for(int i=0;i<nums.length;i++){
         left+=nums[i];
     
    
        if(left==arr[i]) return i;
     }
return -1;
    }
}