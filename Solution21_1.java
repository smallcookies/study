package oj;

//    将两个有序链表合并为一个新的有序链表并返回。
//   新链表是通过拼接给定的两个链表的所有节点组成的。

public class Solution21_1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(-1);
        ListNode temp = dummyHead;
        //   遍历  l1  和  l2
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val) {
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            }
            else {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }
        temp.next = (l1 == null) ? l2 : l1;
        return dummyHead.next;
    }
}
