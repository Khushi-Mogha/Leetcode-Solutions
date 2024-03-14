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
    int c=0,f=0;
TreeNode q=new TreeNode(0);
    public int kthSmallest(TreeNode root, int k) {
       if(root!=null){ kthSmallest(root.left,k);
        c+=1;
        if(c==k &&f==0)
        {q=root;
        f=1;}
        kthSmallest(root.right,k);}
    return q.val;}
}