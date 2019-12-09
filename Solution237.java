package oj;

public class Solution237 {

    public void deleteNode(ListNode node) {
        ListNode dummyhead = new ListNode(node.val-1,null);
        dummyhead.next = node;
        ListNode prev = dummyhead;
        while (prev.next != null) {
            if (prev.next.getVal() == node.val) {
                prev.next = prev.next.next;
            }
            else {
                prev = prev.next;
            }
        }
        node = dummyhead.next;
    }
}
