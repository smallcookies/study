package oj;

//     链表分割
public class Solution6 {
    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        // 小链表的头节点
        ListNode smallHead = new ListNode(-1);
        ListNode smalltemp = smallHead;
        //   大链表的头节点
        ListNode bigHead = new ListNode(-1);
        ListNode bigtemp = bigHead;
        //  遍历原链表
        while (pHead != null) {
            if (pHead.val < x) {
                smalltemp.next = pHead;
                smalltemp = pHead;
            }else {
                bigtemp.next = pHead;
                bigtemp = pHead;
            }
            pHead = pHead.next;
        }
        bigtemp.next = null;
        smalltemp.next = bigHead.next;
        return smallHead.next;
    }
}
