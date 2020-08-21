public class MinimumDepthOfBinaryTree {
     //Definition for a binary tree node.
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    /*
    * 结果还是看了别人的，也许还是太菜了。
    * */
     public int find(TreeNode treeNode){
         if(treeNode == null) return 0;
         int leftDepth = find(treeNode.left);
         int rightDepth = find(treeNode.right);
         if(treeNode.left == null || treeNode.right == null) return Math.max(leftDepth, rightDepth) + 1;
         return Math.min(leftDepth,rightDepth) + 1;
     }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
        int i = minimumDepthOfBinaryTree.find(treeNode);
        System.out.println(i);
    }
}
