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
    int moves;
    public int distributeCoins(TreeNode root) {
        moves=0;
        helper(root);
        return moves;
    }
    int helper(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=helper(node.left);
        int right=helper(node.right);
        moves+=Math.abs(left)+Math.abs(right);
        return (node.val-1)+left+right;
    }
}