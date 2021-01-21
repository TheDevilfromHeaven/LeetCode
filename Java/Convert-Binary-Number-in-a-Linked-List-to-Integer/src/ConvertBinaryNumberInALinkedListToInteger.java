public class ConvertBinaryNumberInALinkedListToInteger {
    /*
    * 作者：dreamscat
      链接：https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/solution/er-jin-zhi-lian-biao-zhuan-zheng-shu-jav-0us1/
      来源：力扣（LeetCode）
    * 积累一下。
    * */
//    public int getDecimalValue(ListNode head) {
//        int sum = 0;
//        while (head != null) {
//            sum = (sum << 1) + head.val;
//            head = head.next;
//        }
//        return sum;
//    }

     //Definition for singly-linked list.
     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

     String str = "";

     public void next(ListNode listNode){
         int index = listNode.val;
         str += index;
         if (listNode.next != null) next(listNode.next);
     }

    public int getDecimalValue(ListNode head) {
         next(head);
         return Integer.valueOf(str.toString(),2);
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(0);
        listNode.next.next = new ListNode(1);
        ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger = new ConvertBinaryNumberInALinkedListToInteger();
        int decimalValue = convertBinaryNumberInALinkedListToInteger.getDecimalValue(listNode);
        System.out.println(decimalValue);
    }
}
