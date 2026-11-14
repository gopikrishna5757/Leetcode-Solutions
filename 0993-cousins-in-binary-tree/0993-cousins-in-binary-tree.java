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
    public boolean isCousins(TreeNode root, int x, int y) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> parent = new HashMap<>();

        return cousin(root,x,y,map,0);
        
        
        
    }
    public static boolean cousin(TreeNode root,int x,int y,Map<Integer,Integer> map,int level){
        if(root==null) return true;
        if(root.left!=null&&root.left.val==x&&root.right!=null&&root.right.val==y) return false;
        if(root.left!=null&&root.left.val==y&&root.right!=null&&root.right.val==x) return false;
        
        map.put(root.val,level);
        if(map.containsKey(x)&&map.containsKey(y)&&map.get(x)==map.get(y)){
            return true;
        }
         if(map.containsKey(x)&&map.containsKey(y)&&map.get(x)!=map.get(y)){
            return false;
        }
        return cousin(root.left,x,y,map,level+1)&&cousin(root.right,x,y,map,level+1);
    }
}