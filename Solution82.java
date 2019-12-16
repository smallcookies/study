package oj;

//     在一个排序的链表中，存在重复的结点，
//     请删除该链表中重复的结点，重复的结点不保留，返回链表头指针


public class Solution82 {
    public ListNode deleteDuplication(ListNode head) {

        //方法1：创建一个虚结点
        //  1.创建一个假结点fake，让它的下一个结点为head,设Node prev=fake；
        //   设p1=head,p2=head.next;
        //  2.当p2不为空时，有两种情况
        //  1)  p1.value!=p2.value,让三个值分别往后走
        //  2) 当p2!=null&&p1.value==p2.value,让p2=p2.next,直到两个值不相等，
        //    跳出循环，直接让 prev.next=p2,p1=p2,直接跳过相等的值，最后p2=p2.next
        //  3.最后返回fake.next

        if (head == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p2 != null) {
            if (p1.val != p2.val) {
                prev = p1;
                p1 = p2;
                p2 = p2.next;
            }
            else {
                while (p2 != null && p1.val == p2.val) {
                    p2 = p2.next;
                }
                prev.next = p2;
                p1 = p2;
                if(p2 != null){
                    p2 = p2.next;
                }
            }
        }
        return dummyHead.next;
    }
}
