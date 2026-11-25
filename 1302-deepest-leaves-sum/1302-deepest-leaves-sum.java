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
    static int sum=0,max=-1; 
    public int deepestLeavesSum(TreeNode root) {
        sum=0;
        max=-1;
        findsum(root,0);
        return sum;
       
        
    }
    public static void  findsum(TreeNode root,int level){
        if(root==null) return;
        if(level>max){
            sum=0;
            max=level;
            sum+=root.val;
        }
        else if(level==max){
            sum+=root.val;
        }
        findsum(root.left,level+1);
        findsum(root.right,level+1);
       

    }
}