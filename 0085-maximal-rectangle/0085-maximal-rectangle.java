class Solution {
     public int MaxArea(int[] heights) {
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
    public int maximalRectangle(char[][] matrix) {
          if(matrix == null || matrix.length == 0){
            return 0;
        }
        int max=0;
        int copy[]=new int[matrix[0].length];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<copy.length;j++){
                    if(matrix[i][j]=='1') copy[j]+=1;
                    else copy[j]=0;
                   

                }
                 max=Math.max(MaxArea(copy),max);
        
            }
     return max;
    }
}