package oj;

public class Solution876_1 {
    //   返回链表中间节点   之遍历一次
    public ListNode middleNode(ListNode head) {
        if (head == null | head.next == null) {
            return head;
        }
        ListNode low = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
        }
        //   此时low 一定在中间位置
        return low;
    }
}
