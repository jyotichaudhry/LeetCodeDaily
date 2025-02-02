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
    List<TreeNode> result ;
    Set<Integer> set;

        public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
            set = Arrays.stream(to_delete).boxed().collect(Collectors.toSet());
            result = new ArrayList<>();
            delNodes( root, true);
            return result;

        }

    private TreeNode delNodes( TreeNode root, boolean is_root) {
            if (root == null) return root;
            boolean is_deleted = set.contains(root.val);
            if (is_root && !is_deleted){
                result.add(root);
            }
           root.left = delNodes( root.left, is_deleted);
            root.right = delNodes( root.right, is_deleted);
            return is_deleted ? null : root;
    }
}