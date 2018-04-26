/**
 * Created by Administrator on 2018/4/26.
 */

//给定一个二叉树，判断其是否是一个有效的二叉搜索树。
public class Leet98 {
    public boolean isValidBST(TreeNode root) {
        boolean ans = false;
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        if(root.left != null && root.right != null){
            if(root.left.val < root.val && root.right.val > root.val){
                ans = true;
            }
            else
                ans = false;
        }
        else if(root.left != null){
            if(root.left.val < root.val)
                ans = true;
            else
                ans = false;
        }
        else if(root.right != null){
            if(root.val < root.right.val)
                ans = true;
            else
                ans = false;
        }

        if(root.right == null)
            return ans && isValidBST(root.left) && (root.val > _max(root.left));
        if(root.left == null)
            return ans && isValidBST(root.right) && (root.val < _min(root.right));
        return ans && isValidBST(root.left) && isValidBST(root.right) && (root.val > _max(root.left)) && (root.val < _min(root.right));
    }

    public int  _min(TreeNode root){
        if(root.left == null && root.right == null){
            return root.val;
        }
        int ans = Integer.MAX_VALUE;
        int tmp = Integer.MAX_VALUE;
        if(root.left != null)
            tmp = Math.min(root.val, _min(root.left));
        if(root.right != null)
            tmp = Math.min(tmp, _min(root.right));
        ans = Math.min(ans, tmp);
        return ans;
    }
    public int  _max(TreeNode root){
        if(root.left == null && root.right == null){
            return root.val;
        }
        int ans = Integer.MIN_VALUE;
        int tmp = Integer.MIN_VALUE;
        if(root.left != null)
            tmp = Math.max(root.val, _max(root.left));
        if(root.right != null)
            tmp = Math.max(tmp, _max(root.right));
        ans = Math.max(ans, tmp);
        return ans;
    }
}
