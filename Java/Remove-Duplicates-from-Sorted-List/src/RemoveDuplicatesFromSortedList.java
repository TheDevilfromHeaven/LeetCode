public class RemoveDuplicatesFromSortedList {
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
      链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/solution/shan-chu-pai-xu-lian-biao-zhong-de-zhong-49v5/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode result = head;
        while (result.next != null){
            if (result.val == result.next.val){
                result.next = result.next.next;
            }else {
                result = result.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        ListNode listNode1 = removeDuplicatesFromSortedList.deleteDuplicates(listNode);
        System.out.println(listNode1.val);
    }
}
