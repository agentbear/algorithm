/**
 * Created by Administrator on 2018/4/25.
 */
public class Leet110 {
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(depth(root.left) + 1, depth(root.right) + 1);
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean ans = Math.abs(depth(root.left) - depth(root.right)) <= 1;
        return ans && isBalanced(root.left) && isBalanced(root.right);
    }
}
