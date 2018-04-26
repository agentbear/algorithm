import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/25.
 */
public class Leet257 {
    int[] path = new int[10000];
    int len = 0;
    List<String> ans = new ArrayList<String>();
    public void DFS(int index, TreeNode root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            String s = "";
            for(int i = 0; i < len; i++){
                s += path[i] + "->";
            }
            s += root.val;
            ans.add(s);
            return;
        }
        path[index] = root.val;
        len++;
        if(root.left != null)
            DFS(index + 1, root.left);
        if(root.right != null)
            len = index + 1;
        DFS(index + 1, root.right);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return new ArrayList<String>();
        }
        DFS(0, root);
        return ans;
    }
}
