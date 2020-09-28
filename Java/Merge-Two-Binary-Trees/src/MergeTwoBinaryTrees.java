public class MergeTwoBinaryTrees {
    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /*
    * 作者：xmblgt
      链接：https://leetcode-cn.com/problems/merge-two-binary-trees/solution/zhe-si-lu-jian-zhi-bu-yao-tai-qing-xi-by-xmblgt/
      来源：力扣（LeetCode）
    * 我写的不好理解，看到个清晰明了的记录一下。
    * */
//    class Solution {
//        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//            if (t1 == null) return t2;
//            if (t2 == null) return t1;
//            t1.left = mergeTrees(t1.left, t2.left);
//            t1.right = mergeTrees(t1.right, t2.right);
//            t1.val += t2.val;
//            return t1;
//        }
//    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if (t1  == null || t2 == null){
            if (t1 != null){
                return new TreeNode(t1.val);
            }else {
                return new TreeNode(t2.val);
            }
        }
        TreeNode treeNode = new TreeNode(t1.val + t2.val);
        TreeNode left = null;
        TreeNode right = null;
        if (t1.left != null && t2.left != null){
            left = mergeTrees(t1.left, t2.left);
        }else if (t1.left != null){
            left = mergeTrees(t1.left,new TreeNode(0));
        }else if (t2.left != null){
            left = mergeTrees(t2.left,new TreeNode(0));
        }
        if (t1.right != null && t2.right != null){
            right = mergeTrees(t1.right, t2.right);
        }else if (t1.right != null){
            right = mergeTrees(t1.right,new TreeNode(0));
        }else if (t2.right != null){
            right = mergeTrees(t2.right,new TreeNode(0));
        }
        return newTree(treeNode,left,right);
    }

    public TreeNode newTree(TreeNode root,TreeNode left,TreeNode right){
        root.left = left;
        root.right = right;
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(3);
        treeNode1.right = new TreeNode(2);
        treeNode1.left.left = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode2.left = new TreeNode(1);
        treeNode2.right = new TreeNode(3);
        treeNode2.left.right = new TreeNode(4);
        treeNode2.right.right = new TreeNode(7);
        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        TreeNode treeNode = mergeTwoBinaryTrees.mergeTrees(treeNode1, treeNode2);
        System.out.println(treeNode.val);
    }
}
