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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
          return new ArrayList<>();
        List<List<Integer>> li = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
           q.add(root);
        int a  = 0;
        while(!q.isEmpty())
        {
            List<Integer> l = new ArrayList<>();
            for(int i = q.size();i > 0;i--)
            {
                TreeNode curr = q.poll();
                l.add(curr.val);
                if(curr.left != null)
                   q.add(curr.left);
                if(curr.right != null)
                   q.add(curr.right);
            }
            if (a % 2 != 0) {
                Collections.reverse(l);
            }
            
            li.add(l);
            a++;
        }
        return li;
    }
}