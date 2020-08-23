import java.util.ArrayList;
import java.util.List;



public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res){
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }
}

/** 递归
 *  时间复杂度：O(n)
 *  空间复杂度：最坏情况下需要空间O(n)，平均情况为O(log n)
  */


