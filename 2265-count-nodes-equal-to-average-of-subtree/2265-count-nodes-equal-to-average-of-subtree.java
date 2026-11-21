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
    int s=0;
    public int averageOfSubtree(TreeNode root) {
       if(root==null) return 0;
       int[] a= new int[2];
       dfs(root,a);
       int avg=a[0]/a[1];
       if(avg==root.val){
        s++;
       }
       averageOfSubtree(root.left);
       averageOfSubtree(root.right);
       return s;
    }
    public static void dfs(TreeNode root,int[] a){
        if(root==null) return ;
        a[0]+=root.val;
        a[1]++;
        dfs(root.left,a);
        dfs(root.right,a);
        
            
    }
}