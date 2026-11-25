/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     HashMap<Integer,Integer> map;
        int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       map=new HashMap<>();
       for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
       }
      return solve(preorder,0,inorder.length-1);
    }
    public TreeNode solve(int[] preorder, int s,int e){
        if(s>e) return null;
        TreeNode node=new TreeNode(preorder[index++]);
        node.left=solve(preorder,s,map.get(node.val)-1);
        node.right=solve(preorder,map.get(node.val)+1,e);
        return node;
    }
}