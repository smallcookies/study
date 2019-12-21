package oj;

//    链表 插入 删除 前驱!
//    在一个排序的链表中，存在重复的结点，
//    请删除该链表中重复的结点，
//   重复的结点不保留，返回链表头指针。
//   例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
public class Solution7 {
    public ListNode deleteDuplication(ListNode pHead){
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = pHead;
        // 删除节点的前驱
        ListNode prev = dummyHead;
        ListNode cur = dummyHead.next;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                //  此时要删除cur
                //  1 2 2 2 2 3
                while (cur.next != null && cur.val == cur.next.val){
                    // 此时cur一直需要删除
                    cur = cur.next;
                }
                // cur 停留在重复节点的最后一个元素
                cur = cur.next;
                prev.next = cur;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}
