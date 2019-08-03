public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /*
        * 官方的递归方法
        * 这个有点复杂，我一时解释不通，也不知道自己的理解是否正确，故不能给与注释，详细请查看官方解释。
        * */
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        l1.val = 3;
        l1.next = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next = new ListNode(4);
        l2.val = 3;
        l2.next = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next = new ListNode(4);
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        mergeTwoSortedLists.mergeTwoLists(l1, l2);
    }
}
