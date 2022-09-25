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
    Integer prev = null;
    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    private boolean inorder(TreeNode root)
    {
        if(root==null)
            return true;
        boolean b1 = inorder(root.left);
        if(prev!=null&&root.val<=prev)
            return false;
        prev = root.val;
        if(b1)
            return inorder(root.right);
        return b1;
    }
        
    
}