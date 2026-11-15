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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l= new ArrayList<>();
        dfs(root,l,0);
        return l;
    }
    public static void dfs(TreeNode root,List<List<Integer>> l,int level){
        if(root==null) return ;
        if(level<l.size()){
           l.get(level).add(root.val);
        }
        else{
            while(l.size()<=level){
                l.add(new ArrayList<>());
            }
            l.get(level).add(root.val);

        }
        dfs(root.left,l,level+1);
        dfs(root.right,l,level+1);

           
    }
}