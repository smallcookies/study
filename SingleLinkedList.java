package List;

//       单链表实现

//   负责具体存储元素内容，以及存储下个节点地址
//Node 类是车厢

import com.sun.java.util.jar.pack.ConstantPool;

class Node{
    private int data;
    Node next;
    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
//      负责提供给用户使用，以及存储下个节点地址
//     火车
public class SingleLinkedList {
    private int size;
    //   永远指向火车车尾车厢
    private Node last;
    //    永远指向火车车头
    private Node frist;

    public void add(int data){
        addLast(data);
    }


    //头插法
    public void addFrist(int data) {
       //产生新节点
        Node node = new Node(data,null);
        if (frist == null){
            frist = last = node;
            size++;
            return;
        }
        node.next = frist;
        frist = node;
        size++;
    }

    //尾插法
    public void addLast(int data) {
        //产生新车厢
        Node node = new Node(data,null);
        //此时车厢还未挂载车厢
        if (last == null){
            last = frist = node;
            size++;
            return;
        }
        //此时火车已有节点
        //要挂载当前最新节点，让最后一个车厢的next指向当前新节点
        last.next = node;
        last = node;
        size++;
    }
    //遍历一个链表
    public void print(){
        //从火车头开始依次遍历直到火车尾
        Node temp = frist;
        while (temp != null){
            System.out.println(temp.getData());
                             temp = temp.next;
        }
    }
    //for (Node x = first;x != null;x = x.next) {
    //    System.out.print(x.getData() +"、");
   // }


    //在链表任意索引处插入新的节点值

    public void addIndex(int index,int data){

         if (index < 0 || index > size){
             System.out.println("索引非法");
             return;
         } else if (index == size) {
             //尾插
             addLast(data);
         } else if (index == 0) {
             //头插
             addFrist(data);
         }else {
             //在中间位置插入Q
             //产生新节点等待插入
             Node newNode = new Node(data,null);
             //需要找到待插入的前驱节点
             Node prev = getIndexNode(index - 1);
             //将新节点尾插到前驱节点后方
             newNode.next = prev.next;
             prev.next = newNode;
             size++;
         }
    }
}
