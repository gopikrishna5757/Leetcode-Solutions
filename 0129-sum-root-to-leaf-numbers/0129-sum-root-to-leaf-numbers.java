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
    public int sumNumbers(TreeNode root) {
        return getsum(root,0);
    }
    public int getsum(TreeNode root,int value){
         if(root==null) return 0;
         if(root.left==null&&root.right==null) return (value*10)+root.val;
         return getsum(root.left,(value*10)+root.val)+getsum(root.right,(value*10)+root.val);
    }
}