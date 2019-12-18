package oj;
//
//  让快慢指针一个走一步一个走两步，
// 当第一次相遇时说明链表带环，此时相遇位置记为相遇点.
// 让快指针返回头结点，与慢指针同步走，
// 当第二次相遇时，相遇位置即为入环位置。
//
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode low = head,fast = head;
        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
            if (low == fast) {
                //此时相遇
                break;
            }
        }
        // low 为相遇点
        fast = head;
        while (low != null && low != fast) {
            low = low.next;
            fast = fast.next;
        }
        return low;
    }
}
