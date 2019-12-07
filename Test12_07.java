package homework;

public class Test12_07 {
    public static void main(String[] args) {
        //生产每个节点
        List list = new List();
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        list.addLast(5);
        list.removeAll(2);
        list.print();
    }
}
