public class SumOfLeftLeaves {
    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    积累一点别人的解法
//    作者：lincs
//    链接：https://leetcode-cn.com/problems/sum-of-left-leaves/solution/java-recursive-solution-by-lincs-2/
//    来源：力扣（LeetCode）
//    public int sumOfLeftLeaves(TreeNode root) {
//        if (root == null) return 0;
//        int sum = 0;
//        if (root.left != null && root.left.left == root.left.right) {
//            sum = root.left.val;
//        }
//        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
//    }

    /*
    * 自己做的题，递归就好了。
    * */
    public int sumOfLeftLeaves(TreeNode root){
        if (root == null) return 0;
        int res = sum(root, 0);
        return res;
    }

    public int sum(TreeNode root,int sum){
        if (root.left != null){
            if (root.left.left == null && root.left.right == null){
                int left = root.left.val;
                sum =  sum + left;
            }
            sum = sum(root.left, sum);
        }
        if (root.right != null){
            sum = sum(root.right, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();
        int i = sumOfLeftLeaves.sumOfLeftLeaves(treeNode);
        System.out.println(i);
    }
}
