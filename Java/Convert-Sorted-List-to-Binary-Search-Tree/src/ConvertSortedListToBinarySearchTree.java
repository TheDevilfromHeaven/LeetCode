public class ConvertSortedListToBinarySearchTree {
     /* Definition for singly-linked list.*/
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

     /* Definition for a binary tree node.*/
     public class TreeNode {
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
     * 链表与树还是第一次接触，不是很明白
     * 下面为参考
     * 作者：powcai
       链接：https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/solution/kuai-man-zhi-zhen-zhao-zhong-dian-by-powcai/
       来源：力扣（LeetCode）
     */
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return statr(head,null);
    }

    public TreeNode statr(ListNode head,ListNode tail){
         if (head == tail) return null;
         ListNode slow = head;
         ListNode fast = head;
         while (fast != tail && fast.next != tail){
            slow = slow.next;
            fast = fast.next.next;
         }
         TreeNode root = new TreeNode(slow.val);
         root.left = statr(head,slow);
         root.right = statr(slow.next,tail);
         return root;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(0, listNode2);
        ListNode listNode4 = new ListNode(-3, listNode3);
        ListNode listNode5 = new ListNode(-10, listNode4);
        ConvertSortedListToBinarySearchTree convertSortedListToBinarySearchTree = new ConvertSortedListToBinarySearchTree();
        TreeNode treeNode = convertSortedListToBinarySearchTree.sortedListToBST(listNode5);
        System.out.println(treeNode.val);
        System.out.print(treeNode.left.val+" ");
        System.out.println(treeNode.right.val);
        System.out.print(treeNode.left.left.val+" ");
        System.out.println(treeNode.right.left.val);
        System.out.println("执行完成");
    }
}
