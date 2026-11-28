class Solution {
    public int largestRectangleArea(int[] heights) {
       Stack <Integer> st1=new Stack<>(); 
       Stack <Integer> st2=new Stack<>();
       int [] left=new int[heights.length]; 
       int [] right=new int[heights.length]; 

       for(int i=0;i<heights.length;i++){
        while((!st1.isEmpty()) && heights[st1.peek()]>=heights[i]) st1.pop();
        if(st1.isEmpty()) left[i]=-1;
        else left[i]=st1.peek();

        st1.push(i);
       }

        for(int i=heights.length-1;i>=0;i--){
        while((!st2.isEmpty()) && heights[st2.peek()]>=heights[i]) st2.pop();
        if(st2.isEmpty()) right[i]=heights.length;
        else right[i]=st2.peek();

        st2.push(i);
       }

       int maxarea=0;
       for(int i=0;i<heights.length;i++){
        int area=(right[i]-left[i]-1)*heights[i];
        maxarea=Math.max(maxarea,area);
       }
       return maxarea;
    }
}