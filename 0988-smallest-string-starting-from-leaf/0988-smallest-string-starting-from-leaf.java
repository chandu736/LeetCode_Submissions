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
    private String res="";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,new StringBuilder());
        return res;
    }
    private void dfs(TreeNode node, StringBuilder sb){
        if(node==null) return;

        sb.insert(0,(char)(node.val+97));

        if(node.left==null && node.right==null){
           if(res.equals("")){
            res=sb.toString();
           }else{
            res=res.compareTo(sb.toString())>0?sb.toString():res;
           }
        }

        dfs(node.left, sb);
        dfs(node.right, sb);
        sb.deleteCharAt(0);
    }
}