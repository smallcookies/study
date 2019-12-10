package oj;

//3. 给定一个带有头节点 head 的非空单链表，返回链表的中间节点。
//   如果有两个中间节点，则返回第二个中间节点。
public class Solution876 {
    public ListNode middleNode(ListNode head) {
        int len = size(head);
        int toMove = len/2;
        ListNode cur = head;
        for (int i =0;i < toMove;i++){
            cur = cur.next;
        }
        return cur;
    }
    public int size(ListNode head){
        int count = 0;
        for (ListNode cur = head;cur != null;cur = cur.next){
            count ++;
        }
        return count;
    }
}
