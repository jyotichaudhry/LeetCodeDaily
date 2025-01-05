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
class FindElements {

    TreeNode root  ;
    boolean []exists = new boolean[1148576];
    public FindElements(TreeNode root) {
    
    this.root = getCorrectBinaryTree(0,root.left,root.right);
    
       
    }
    
    private TreeNode getCorrectBinaryTree(int val, TreeNode left, TreeNode right){
        TreeNode root = new TreeNode(val);
        exists[val] = true;
        if (left != null){
                root.left = getCorrectBinaryTree( val*2+1,left.left,left.right);
        }  
        if (right != null){
            root.right =  getCorrectBinaryTree( val*2+2,right.left,right.right);
        }
        return root;
    }

    public boolean find(int target) {
        return exists[target];
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */