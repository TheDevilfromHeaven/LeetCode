import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
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
    * 做完看下官方答案，一模一样。
    * */
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        dfs(root1,list1);
        dfs(root2,list2);
        return list1.equals(list2);
    }

    public void dfs(TreeNode treeNode,List<Integer> list){
         if(treeNode.left == null && treeNode.right == null){
             list.add(treeNode.val);
         }else{
             if (treeNode.left != null){
                 dfs(treeNode.left,list);
             }
             if (treeNode.right != null){
                 dfs(treeNode.right,list);
             }
         }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(2 );
        treeNode1.right = new TreeNode(2);
        LeafSimilarTrees leafSimilarTrees = new LeafSimilarTrees();
        boolean b = leafSimilarTrees.leafSimilar(treeNode, treeNode1);
        System.out.println(b);
    }
}
