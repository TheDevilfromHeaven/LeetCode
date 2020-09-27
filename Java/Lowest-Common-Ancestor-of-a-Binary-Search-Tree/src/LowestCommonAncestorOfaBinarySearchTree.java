public class LowestCommonAncestorOfaBinarySearchTree {
    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     *作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/solution/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-26/
      来源：力扣（LeetCode）
     *没做出来。官方的解法。
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       TreeNode ancestor = root;
       while (true){
           if (p.val < ancestor.val && q.val < ancestor.val){
               ancestor = ancestor.left;
           }else if (p.val > ancestor.val && q.val > ancestor.val){
               ancestor = ancestor.right;
           }else {
               break;
           }
       }
       return ancestor;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(6);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(8);
        treeNode.left.left = new TreeNode(0);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(7);
        treeNode.right.right = new TreeNode(9);
        treeNode.left.right.left = new TreeNode(3);
        treeNode.left.right.right = new TreeNode(5);
        LowestCommonAncestorOfaBinarySearchTree lowestCommonAncestorOfaBinarySearchTree = new LowestCommonAncestorOfaBinarySearchTree();
        TreeNode result = lowestCommonAncestorOfaBinarySearchTree.lowestCommonAncestor(treeNode,new TreeNode(2),new TreeNode(8));
        System.out.println(result.val);
    }
}
