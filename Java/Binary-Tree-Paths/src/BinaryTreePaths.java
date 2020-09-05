import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
     //Definition for a binary tree node.
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        build(root, "",list);
        return list;
    }

    public void build(TreeNode root,String s,List<String> list){
        if(root != null){
            StringBuffer stringBuffer = new StringBuffer(s);
            stringBuffer.append(Integer.toString(root.val));
            if(root.left == null && root.right == null){
                list.add(stringBuffer.toString());
            }else {
                stringBuffer.append("->");
                build(root.left,stringBuffer.toString(),list);
                build(root.right,stringBuffer.toString(),list);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.right = new TreeNode(5);
        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        List<String> list = binaryTreePaths.binaryTreePaths(treeNode);
        System.out.println(list);
    }
}
