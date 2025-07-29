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
    public boolean isValidBST(TreeNode root) {
        return Valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean Valid(TreeNode node,long minimum,long maximum){
        if(node==null){
            return true;
        }
        if((node.val<=minimum || node.val>=maximum)){
            return false;
        }
        return Valid(node.left,minimum,node.val)&&Valid(node.right,node.val,maximum);
    }
}
