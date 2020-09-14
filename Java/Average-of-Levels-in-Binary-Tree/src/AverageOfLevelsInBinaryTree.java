import java.util.*;

public class AverageOfLevelsInBinaryTree {
    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /*
    * 有一道跟这个类似，题号是107.二叉树的层序遍历II。
    * 我在原代码上添加了处理平均数的方法。
     * */
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null){
            return new ArrayList<Double>();
        }
        ArrayList<Double> res = new ArrayList<Double>();
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
            Double sum = 0.0;
            for (int j=0;j<tmp.size();j++){
                sum += tmp.get(j);
            }
            Double vag = sum / tmp.size();
            res.add(vag);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.left.left = new TreeNode(15);
        treeNode.left.right = new TreeNode(7);
        AverageOfLevelsInBinaryTree binaryTreeLevelOrderTraversal = new AverageOfLevelsInBinaryTree();
        List<Double> lists = binaryTreeLevelOrderTraversal.averageOfLevels(treeNode);
        System.out.println(lists);
    }
}
