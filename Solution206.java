package oj;


public class Solution206 {
    public ListNode reverseList(ListNode head){
        //边界值判断
        if (head == null && head.next == null){
            //此时链表为空或者只有一个节点
            return head;
        }
        //产生一个新链表
        ListNode newhead = new ListNode(head.val);
        //  遍历原链表
        while (head.next != null) {
            ListNode node = new ListNode(head.next.val);
            node.next = newhead;
            newhead = node;
            head = head.next;
        }
        return newhead;
    }
}
