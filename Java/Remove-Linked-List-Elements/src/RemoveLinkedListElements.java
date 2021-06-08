public class RemoveLinkedListElements {
     //Definition for singly-linked list.
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    /*
   * 作者：LeetCode-Solution
   链接：https://leetcode-cn.com/problems/remove-linked-list-elements/solution/yi-chu-lian-biao-yuan-su-by-leetcode-sol-654m/
   来源：力扣（LeetCode）
   * 官方解法一。
   * */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    /*
    * 作者：LeetCode-Solution
    链接：https://leetcode-cn.com/problems/remove-linked-list-elements/solution/yi-chu-lian-biao-yuan-su-by-leetcode-sol-654m/
    来源：力扣（LeetCode）
    * 官方解法二。
    * */
//    public ListNode removeElements(ListNode head, int val) {
//        if (head == null) return head;
//        ListNode pre = new ListNode(0);
//        pre.next = head;
//        ListNode next = pre;
//        while (next.next != null){
//            if (next.next.val == val){
//                next.next = next.next.next;
//            }else {
//                next = next.next;
//            }
//        }
//        return pre.next;
//    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        ListNode listNode = removeLinkedListElements.removeElements(head, 6);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
        System.out.println(listNode.next.next.next.val);
        System.out.println(listNode.next.next.next.next.val);
    }
}
