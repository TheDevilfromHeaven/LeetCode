import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
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
      链接：https://leetcode-cn.com/problems/increasing-order-search-tree/solution/di-zeng-shun-xu-cha-zhao-shu-by-leetcode-dfrr/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root,result);
        TreeNode dummyNode = new TreeNode(-1);
        TreeNode cur = dummyNode;
        for (int n : result){
            cur.right = new TreeNode(n);
            cur = cur.right;
        }
        return dummyNode.right;
    }

    public void inorder(TreeNode node,List<Integer> result){
        if (node == null) return;
        inorder(node.left,result);
        result.add(node.val);
        inorder(node.right,result);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(7);
        IncreasingOrderSearchTree increasingOrderSearchTree = new IncreasingOrderSearchTree();
        TreeNode treeNode1 = increasingOrderSearchTree.increasingBST(treeNode);
        System.out.println(treeNode1.val);
        System.out.println(treeNode1.right.val);
        System.out.println(treeNode1.right.right.val);
    }
}
