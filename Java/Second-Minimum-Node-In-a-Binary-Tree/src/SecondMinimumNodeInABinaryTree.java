public class SecondMinimumNodeInABinaryTree {
     //Definition for a binary tree node.
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
      链接：https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/solution/er-cha-shu-zhong-di-er-xiao-de-jie-dian-bhxiw/
      来源：力扣（LeetCode）
    * 官方解法一：深度优先搜索
    * */
    int ans;
    int rootValue;

    public int findSecondMinimumValue(TreeNode root) {
        ans = -1;
        rootValue = root.val;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root){
        if (root == null){
            return;
        }
        if (ans != -1 && root.val >= ans){
            return;
        }
        if (root.val > rootValue){
            ans = root.val;
        }
        dfs(root.left);
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(5);
        treeNode.right.right = new TreeNode(7);
        int secondMinimumValue = new SecondMinimumNodeInABinaryTree().findSecondMinimumValue(treeNode);
        System.out.println(secondMinimumValue);
    }
}
