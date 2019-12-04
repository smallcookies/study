package DynamicArray12_03;

import java.util.Arrays;

public class MyArray {
    int num[];
    int size;

    public MyArray(int length) {
        this.num = new int[length];
    }
    /**
     * 向动态数组中添加元素，默认向数组末尾添加
     * @param data
     */
    public void add(int data) {
        if (size == num.length) {
            num = Arrays.copyOf(num,num.length << 1);
        }
        num[size] = data;
        size ++;
    }

    /**
     * 向动态数组的任意位置插入元素
     * @param index 插入的目标索引
     * @param data
     */
    public void add(int index,int data) {
        // 判断index是否合法
        if (index < 0 || index > size) {
            // 只要index > size 都是非法的，因为数组无法取到数组长度的下标
            System.out.println("索引非法!");
            return;
        }
        // 数组尾插
        if (index == size) {
            add(data);
        }else {// 数组中间位置插入
            // 判断内部数组是否满载
            if (size == num.length) {
                num = Arrays.copyOf(num,num.length << 1);
            }
            // 将index以及之后元素向后搬移
            System.arraycopy(num,index,num,index + 1,size - index);
            num[index] = data;
            size ++;
        }
    }
    // 返回动态数组长度
    public int size() {
        return size;
    }

    // 打印动态数组内容
    public void print() {
        // 数组永远无法取到数组长度下标，因此不能等于size
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + "、");
        }
    }
}
