package homework;
import java.util.Scanner;

public class Test11_23 {
        //6. 求两个正整数的最大公约数
    public static void main(String[] args) {
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();
        int c = gys(a,b);
        System.out.println(a+"和"+b+"最大公约数是："+c);
    }
    public static int gys(int a,int b) {
        if (b == 0){
            return a;
        }
        int r = a % b;
        return gys(b, r);
    }





////    7. 计算1/1-1/2+1/3-1/4+1/5 …… +   1/99 - 1/100 的值。
//    public static void main(String[] args) {
//        double sum1=0 ;
//        for (double i = 1;i<=99;i+=2){
//            sum1 += (1/i);
//        }
//        double sum2=0;
//        for (double j = 2;j <= 100;j+=2){
//            sum2 += (1/j);
//        }
//        System.out.println(sum1-sum2);
//    }
//    // 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
//    //可以看成两部分 1/1+1/3+1/5+…+1/99
//    // 和 1/2+1/4+1/6+1/8+…+1/100
//    //然后第一部分减去第二部分即我们想要的值

}
