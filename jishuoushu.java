package homeeork;
/*给一个数组：1 3 2 4 2 5 0
奇数在前偶数在后
1.额外开辟新内存
2.不允许额外开辟新内存
 */
public class jishuoushu {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 2, 5, 0};
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            int m = i + 2;
            if (m % 2 == 0) {
                System.out.println("ww");
            } else
                System.out.println("ss");
        }
    }
}