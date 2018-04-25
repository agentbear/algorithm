/**
 * Created by Administrator on 2018/4/25.
 */
public class Leet112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }

        if(sum == root.val && root.left == null && root.right == null){
            return true;
        }

        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
