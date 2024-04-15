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
    private int totalSum=0;
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return totalSum;
    }
    private void dfs(TreeNode node, int currNum){
        if(node==null){
            return;
        }
        currNum=currNum*10+node.val;
        if(node.left==null && node.right==null){
            totalSum+=currNum;
            return;
        }
        dfs(node.left,currNum);
        dfs(node.right,currNum);
    }
}