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
    static void helper(TreeNode root,List<Integer>list){
        if(root==null)return ;
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }
    public boolean isUnivalTree(TreeNode root) {
        int val=root.val;
        List<Integer>list=new ArrayList<>();
        helper(root,list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=val)return false;
        }return true;
    }
}