import java.util.*;

public class BinaryTreeLevelOrderTraversal {
     //Definition for a binary tree node.
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

     /*
     * 作者：wang_ni_ma
       链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/solution/san-chong-shi-xian-tu-jie-107er-cha-shu-de-ceng-ci/
       来源：力扣（LeetCode）
      * 广度优先实现，还是以积累为主。
      * */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null){
            return new ArrayList<List<Integer>>();
        }
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for (int i=0;i<size;++i){
                TreeNode poll = queue.poll();
                tmp.add(poll.val);
                if (poll.left != null){
                    queue.offer(poll.left);
                }
                if (poll.right != null){
                    queue.offer(poll.right);
                }
            }
            res.add(tmp);
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.left.left = new TreeNode(15);
        treeNode.left.right = new TreeNode(7);
        BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> lists = binaryTreeLevelOrderTraversal.levelOrderBottom(treeNode);
        System.out.println(lists);
    }
}
