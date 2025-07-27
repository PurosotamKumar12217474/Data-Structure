import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    private static List<Integer> res = new ArrayList<>();
    private static void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        helper(root.right);
        res.add(root.val);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        helper(root);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        List<Integer> res = postorderTraversal(root);
        System.out.println(res);
    }
}