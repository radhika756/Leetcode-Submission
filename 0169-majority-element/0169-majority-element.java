class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        int winner=arr[0];
        int vote=1;
        for(int i=1;i<n;i++){
            if(arr[i]==winner){
                vote++;
            }
            else vote--;
            if(vote==0){
                winner=arr[i];
                vote=1;
            }
        }
        return winner;
    }
}