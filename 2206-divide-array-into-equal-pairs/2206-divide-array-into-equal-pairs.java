class Solution {
    public boolean divideArray(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<>(); 
     int n=nums.length;
     for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     } 
      for(int frequency:map.values()){
            if(frequency%2!=0) return false;
        }
     return true; 
    }
}