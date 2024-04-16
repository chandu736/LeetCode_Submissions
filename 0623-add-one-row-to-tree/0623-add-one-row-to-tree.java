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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newRoot=new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }
        insert(root, val, depth, 1);
        return root;
    }
    private void insert(TreeNode node, int val, int depth, int currDepth){
        if(node==null){
            return;
        }
        if(currDepth==depth-1){
            TreeNode tempLeft=node.left;
            TreeNode tempRight=node.right;

            TreeNode newLeft=new TreeNode(val);
            TreeNode newRight=new TreeNode(val);

            newLeft.left=tempLeft;
            newRight.right=tempRight;

            node.left=newLeft;
            node.right=newRight;
        }else{
            insert(node.left, val, depth, currDepth+1);
            insert(node.right, val, depth, currDepth+1);
        }
    }
}