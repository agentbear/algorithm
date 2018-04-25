/**
 * Created by Administrator on 2018/4/25.
 */

//给定一个二叉树，检查它是否是镜像对称的。

public class Leet101 {
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }

        public boolean check(TreeNode left, TreeNode right) {
            if(left == null && right == null){
                return true;
            }
            else if(left == null || right == null){
                return false;
            }
            if(left.val != right.val){
                return false;
            }
            return check(left.right, right.left) && check(left.left, right.right);
        }

        public boolean isSymmetric(TreeNode root) {
            if(root == null){
                return true;
            }
            return check(root.left, root.right);
        }



}
