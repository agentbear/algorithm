/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//层次遍历二叉树

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

class Leet102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        if(root == null){
            return ans;
        }
        int length = 0;
        while(!q.isEmpty()){
            List<Integer> each = new ArrayList<Integer>();
            length = q.size();
            while(length != 0){
                TreeNode node = q.poll();
                each.add(node.val);
                length--;
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            ans.add(each);
        }
        return ans;
    }
}