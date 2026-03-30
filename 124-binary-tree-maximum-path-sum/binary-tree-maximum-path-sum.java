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
    int maxSum ;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;;
        solve(root);
        return maxSum;
    }
    public int solve(TreeNode root){
        if(root == null) {return 0;}

        int l = solve(root.left) ;
        int r = solve(root.right);
        
        int one  =  l + r+ root .val;
        int two =  root.val;
        int three = Math.max(l,r) + root.val;
        maxSum = Math.max(maxSum, Math.max(one, Math.max(two, three)));
        return Math.max(two,three);
    }
}