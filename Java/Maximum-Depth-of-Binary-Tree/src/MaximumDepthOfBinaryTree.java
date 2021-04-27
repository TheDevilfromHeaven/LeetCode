import com.sun.scenario.effect.Brightpass;

public class MaximumDepthOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/solution/er-cha-shu-de-zui-da-shen-du-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 官方解法一，写的很好。
    * */
//    public int maxDepth(TreeNode root) {
//        if (root == null) {
//            return 0;
//        } else {
//            int leftHeight = maxDepth(root.left);
//            int rightHeight = maxDepth(root.right);
//            return Math.max(leftHeight, rightHeight) + 1;
//        }
//    }

    public int maxDepth(TreeNode root) {
        int result = 0;
        int test = test(root, result);
        return test;
    }

    public int test(TreeNode root,int result){
        if (root == null) return result;
        result++;
        int left = result;
        int right = result;
        if (root.left != null){
            left = test(root.left, result);
        }
        if (root.right != null){
            right = test(root.right,result);
        }
        return Math.max(left,right);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.left = new TreeNode(7);
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        int i = maximumDepthOfBinaryTree.maxDepth(treeNode);
        System.out.println(i);
    }
}
