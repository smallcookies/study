package oj;

//      删除链表中等于给定值 val 的所有节点。

public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        //   给定值恰好为头节点，一个if就行的事，为什么用while循环？
        //   假设，前几个节点的数据域为val，或者整个链表节点的数据域为val时，
        //   这时就会用到while循环了
        while (head != null && head.val == val) {
            head = head.next;
        }
        /*
        此时有两种情况
        	1：前几个节点的数据域为val，删除了指定节点后，留下了待删除节点均有前驱节点的链表
        		例如： 1->1->1->2->6->3->4->1->6, val = 1--->  2->6->3->4->1->6
        	2：整个链表的数据域为val，被删除完毕
        */
        //   处理第一种情况

        if (head == null) {
            return null;
        }
        //处理第1种情况
        ListNode prev = head;//前驱节点
        //while循环的出口初学者不好确定，记住谁待删除，就找谁
        while (prev.next != null){
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }
        return head;
    }
}

