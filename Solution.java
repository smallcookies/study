package oj;

//   输入两个单调递增的链表，输出两个链表合成之后的链表，满足单调不减规则。


public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2){
        ListNode node = new ListNode(-1);
        ListNode temp = node;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        if (list1 != null) {
            temp.next = list1;
        }
        if (list2 != null) {
            temp.next = list2;
        }
        return node.next;
    }
}
