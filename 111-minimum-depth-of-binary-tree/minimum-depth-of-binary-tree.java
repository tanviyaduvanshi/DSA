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
        if(root.left==null)return helper(root.right)+1;
        if(root.right==null)return helper(root.left)+1;
        return Math.min(helper(root.left),helper(root.right))+1;
    }
    public int minDepth(TreeNode root) {
        return helper(root);
    }
}