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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> l= new ArrayList<>();

        dfs(root,l,0);
        return l;
    }
    public static void dfs(TreeNode root,List<Integer> l,int level){
        if(root==null) return;
        if(level<l.size()){
           l.set(level,Math.max(l.get(level),root.val));  
        }
        else{
            l.add(root.val);

        }
        dfs(root.left,l,level+1);
        dfs(root.right,l,level+1);
    }
}