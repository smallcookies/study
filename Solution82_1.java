package oj;

//方法2：不创建虚结点
//
//   和方法1相似：不同的是，设一个prev=null，在遇到两个相等的值时，
//   要看prev是否为空，为空的话直接让p2=head;
//   否则的话,prev.next=p2;最后直接返回头结点

public class Solution82_1 {
    //方法2：不创建虚结点
    public  ListNode deleteDuplication1(ListNode head){
        if(head == null){
            return null;
        }
        ListNode prev = null;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2 != null){
            if(p1.val != p2.val){
                prev = p1;
                p1 = p2;
                p2 = p2.next;
            }
            else{
                while(p2 != null && p1.val == p2.val){
                    p2 = p2.next;
                }
                if(prev == null){
                    head = p2;
                }
                else{
                    prev.next = p2;
                }
                p1 = p2;
                if(p2 != null){
                    p2 = p2.next;
                }
            }
        }
        return head;
    }
}
