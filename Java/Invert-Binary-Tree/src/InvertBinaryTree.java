public class InvertBinaryTree {
    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/invert-binary-tree/solution/fan-zhuan-er-cha-shu-by-leetcode-solution/
      来源：力扣（LeetCode）
      * 递归方法
      * 通过递归到达叶子节点，进行左右交换，返回TreeNode，接着交换返回TreeNode，对根节点不操作。
    * */
    public TreeNode inverBinargTree(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode left = inverBinargTree(root.left);
        TreeNode right = inverBinargTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(9);
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode result = invertBinaryTree.inverBinargTree(treeNode);
        System.out.println(result.val + " " + result.left.val + " " + result.right.val + " " + result.left.left.val + " " + result.left.right.val + " " + result.right.left.val + " " + result.right.right.val);
    }
}