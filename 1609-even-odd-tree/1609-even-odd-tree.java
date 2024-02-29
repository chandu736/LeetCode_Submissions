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
 *      }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int level=0;

        while(!queue.isEmpty()){
            int size=queue.size();
            int preValue=(level%2==0)?Integer.MIN_VALUE:Integer.MAX_VALUE;

            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if((level%2==0 && (node.val%2==0 || node.val<=preValue)) ||
                (level%2!=0 && (node.val%2!=0 || node.val>=preValue))){
                    return false;
                }
                preValue=node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            level++;
        }
        return true;
    }
}