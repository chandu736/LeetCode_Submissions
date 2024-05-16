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
    public boolean evaluateTree(TreeNode root) {
        return evaluate(root);
    }
    private boolean evaluate(TreeNode node){
        if(node.left==null && node.right==null){
            return node.val==1;
        }
        boolean leftVal=evaluate(node.left);
        boolean rightVal=evaluate(node.right);
        if(node.val==2){
            return leftVal || rightVal;
        }else{
            return leftVal && rightVal;
        }
    }
}