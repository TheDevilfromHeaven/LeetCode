public class LinkedListCycle {
    //Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/linked-list-cycle/solution/huan-xing-lian-biao-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 官方方法二。积累一下。
    * */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (slow != fast){
            if (fast == null || fast.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(0);
        listNode1.next = new ListNode(-4);
        listNode1.next = listNode1;
        listNode.next = listNode1;
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        boolean b = linkedListCycle.hasCycle(listNode);
        System.out.println(b);
    }
}
