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
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        boolean flag_LR = true ;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            int[] temp = new int[size];

            for(int i = 0;i<size ;i++){
                TreeNode node = q.poll();
                int idx = flag_LR? i: size-1-i;
                temp[idx] = node.val;

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
             List<Integer> level = new ArrayList<>();
            for (int val : temp) level.add(val);

            ans.add(level);
            flag_LR = !flag_LR;

        }
        return ans;
    }
}