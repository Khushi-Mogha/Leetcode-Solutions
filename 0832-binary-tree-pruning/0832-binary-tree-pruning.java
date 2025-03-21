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
    public TreeNode pruneTree(TreeNode root) {
        if(root==null)
        return root;
        pruneTree(root.left);
        pruneTree(root.right);
        if(root.left!=null && root.left.val==0)
        {
            if(root.left.left==null && root.left.right==null)
            root.left=null;
        }
        if(root.right!=null && root.right.val==0){
            if(root.right.left==null && root.right.right==null)
            root.right=null;
        }
    if(root.left==null && root.right==null && root.val==0)
    return null;
    else
    return root;}
}