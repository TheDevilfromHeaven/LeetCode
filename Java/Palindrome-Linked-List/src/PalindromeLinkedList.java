import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList {
     //Definition for singly-linked list.
     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

     /*
     * 作者：sdwwld
       链接：https://leetcode-cn.com/problems/palindrome-linked-list/solution/di-gui-zhan-deng-3chong-jie-jue-fang-shi-zui-hao-d/
       来源：力扣（LeetCode）
     *先入栈，然后出栈与链做比较，由于栈是先进后出，所以出栈相当于倒序的链表，比较没错就是回文链表了。
     * public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack();
        //把链表节点的值存放到栈中
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        //然后再出栈
        while (head != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
    */

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        List<Integer> list = new ArrayList<>();
        ListNodeToList(head, list);
        Stack stack = new Stack();
        for (int i = 0;i<list.size();i++){
            if (list.size()%2 == 1 && i == ((list.size()*10 / 2 - 5) / 10)) continue;
            if (stack.isEmpty() == true){
                stack.push(list.get(i));
            }else {
                Integer peek = (Integer) stack.peek();
                if (peek.intValue() == list.get(i).intValue()){
                    stack.pop();
                }else {
                    stack.push(list.get(i));
                }
            }
        }
        return stack.isEmpty();
    }

    public void ListNodeToList(ListNode listNode, List<Integer> list){
        int val = listNode.val;
        System.out.println(val);
        if (listNode.next != null){
             list.add(val);
             ListNodeToList(listNode.next,list);
         }else {
             list.add(val);
         }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(0);
        listNode.next.next = new ListNode(1);
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean palindrome = palindromeLinkedList.isPalindrome(listNode);
        System.out.println(palindrome);
    }
}
