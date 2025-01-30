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
    List<Integer> ls=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        return print_BT(root);
    }

    public List<Integer> print_BT(TreeNode root)
    {
        if(root == null ) return new ArrayList<>();
        print_BT(root.left);
        print_BT(root.right);
        ls.add(root.val);
        return ls;
    }
}
