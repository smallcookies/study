package List;

public class SeqList {
    //    由于只是表示表中能含多少元素，所以不必要让使用者看到
    private int num = 10;
    //    存放数据的数组
    private int [] data = new int[num];
    //    表示当前表中有效元素个数
    private int size = 0;
    //    打印顺序表
    public void display(){
        System.out.print("[");
        for (int i = 0;i < size;i ++){
            System.out.print(data[i]);
            if (i < this.size - 1){
                //   最后一个元素不需要打印“，”
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    //    在pos 位置新增元素
    public void add(int pos,int data){
        if (pos < 0 || pos > size) {
            //   判断输入合法性
            System.out.println("您的操作有误！请重新操作！");
            return;
        }else if (size >= num){
            //  如果表已经满了需要扩容
            addList();
            System.out.println("内容已满！已经扩容10个，请重新操作！");
            return;
        } else if (pos == size) {
            //   在最后位置新填元素
            this.data[pos] = data;
            size ++;
        }else {
            //  在中间位置新增元素
            for (int i = size - 1; i < pos; i--){
                this. data[i + 1] = this.data[i];
            }
            this.data[pos] = data;
            size ++;
        }
    }


    //  扩容10个元素
    public  void addList(){
        //   在原基础上在增加10个
        num = num + 10;
        int[] data = new int[num];
        for (int i = 0;i < size;i++){
            data[i] = this.data[i];
        }
        this.data = data;
    }

    //  查找某个元素对应的位置

    public void search(int toFind){
        int i = 0;
        for (i = 0;i < size; i++) {
            if (data[i] == toFind) {
                System.out.println("位置是：" + i);
            }
        }
        if (i >= size) {
            // 如果 i >= size  说明目标元素不存在
            System.out.println(toFind + "不存在");
        }
    }
}
