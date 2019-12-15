package oj;

//      删除列表中重复的元素
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        //   设置一个指向当前元素的指针
        ListNode current = head;
        //    当链表为空或者链表中遍历到最后一个元素时，出循环
        while (current != null && current.next != null) {
            //   如果找到当前节点和它的下一节点的值相同，删除掉下一个节点
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                //   如果没有找到，当前节点后移
                current = current.next;
            }
        }
        return head;
    }
}
