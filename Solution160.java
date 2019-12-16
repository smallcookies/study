package oj;

//编写一个程序，找到两个单链表相交的起始节点。
//    两次遍历 ，裁剪长的链表
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        int countA = 0;
        int countB = 0;
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != null) {
            countA ++;
            pA = pA.next;
        }
        while (pB != null) {
            countB ++;
            pB = pB.next;
        }
        while (countA > countB) {
            countA --;
            headA = headA.next;
        }
        while (countB > countA) {
            countB --;
            headB = headB.next;
        }
        //  此时A 与 B 一定一样长
        while (headA != null) {
            if (headA == headB) {
                return headA;
            }else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
