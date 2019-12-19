package oj;

//   给定一个链表，删除链表的倒数第 2个节点，
//   并且返回链表的头结点。
//   1，2, 3, 4, 5，6， null
//                       l1
//           l2
//       l1先跑三格   l2  再跑  之间差 3 ，找到要删除元素的前一个

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 先引入一个虚拟节点
        ListNode tempHead = new ListNode(0);
        tempHead.next = head;
        ListNode l1 = head, l2 = head;
        //  l1 比 l2  先跑 n 次
        for (int i = 0;i < n;i ++){
            if (l1 == null) {
                return head;
            }else {
                l1 = l1.next;
            }
        }
        //   l1 ,l2  一起往前跑，直到 l1 的next 为空
        //   l2 所指的下一个节点就是要删除的元素位置
        while (l1.next != null) {
            l1 = l1.next;
            l2 = l2.next;
        }
        //  删除 l2 指向的节点的下一个元素
        l2.next = l2.next.next;
        //   删除虚拟头节点
        return tempHead.next;
    }
}
