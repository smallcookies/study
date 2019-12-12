package oj;

//      删除链表中等于给定值 val 的所有节点。
//      输入: 1->2->6->3->4->5->6, val = 6
//      输出: 1->2->3->4->5

public class Solution203_1 {
    public ListNode removeElements(ListNode head, int val){
        //  先引入一个虚拟头节点
        ListNode dummyHead = new ListNode(val -1);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null) {
            if (temp.next.val == val) {
                //   temp 恰好为待删除节点的前驱
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }
}
