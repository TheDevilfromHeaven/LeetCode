public class MinimumAbsoluteDifferenceInBST {
    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/solution/er-cha-sou-suo-shu-de-zui-xiao-jue-dui-chai-by-lee/
      来源：力扣（LeetCode）
    * 官方解法。没能做出，积累一下。
    * */
    int ans;
    int pre;

    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root){
        if (root == null) return;
        dfs(root.left);
        if (pre == -1){
            pre = root.val;
        }else {
            ans = Math.min(ans,root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(2);
        MinimumAbsoluteDifferenceInBST minimumAbsoluteDifferenceInBST = new MinimumAbsoluteDifferenceInBST();
        int minimumDifference = minimumAbsoluteDifferenceInBST.getMinimumDifference(treeNode);
        System.out.println(minimumDifference);
    }
}
