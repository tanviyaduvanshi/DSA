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
    static int helper(TreeNode root){
        if(root==null)return 0;
        int ld=helper(root.left);
        int rd=helper(root.right);
        if(root.left==null)return rd+1;
        if(root.right==null)return ld+1;
        return Math.min(ld,rd)+1;
    }
    public int minDepth(TreeNode root) {
        return helper(root);
    }
}