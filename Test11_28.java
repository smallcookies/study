package homework;

public class Test11_28 {
    //    //13. 输出一个整数的每一位.
//    public static void main(String[] args) {
//        int i = 12321444;
//        int num = 0;
//        while(i>0){
//            System.out.println();
//            i/= 10;
//        }
//    }
    //13. 输出一个整数的每一位.
    //第一种:手动输出
//    public static void main(String[] args) {
//        int i = 123;
//        int a;
//        int b;
//        int c;
//        a = i/100;
//        b = (i-a*100)/10;
//        c = (i-a*100)%10;
//        System.out.println("百位的数字为："+a);
//        System.out.println("十位的数字为："+b);
//        System.out.println("个位的数字为："+c);
//    }
// 13. 输出一个整数的每一位.
////第二种方法：     递归
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你要查询的数字:");
//        int a = sc.nextInt();
//        print(a);
//    }
//    public static void print(int a ){
//        if (a>9){
//            print(a/10);
//        }
//        System.out.println(a%10 + "");
//    }





//// 猜数字（整数类型1-100）
//    public static void main(String[] args) {
//        int i = 32;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数字：");
//        int a = sc.nextInt();
//            if (a < i) {
//                System.out.println("数字小了!");
//            } else if (a > i) {
//                System.out.println("数字大了！");
//            } else if (a == i) {
//                System.out.println("输入正确！恭喜你！");
//            }
//    }




//
//    //系统猜数字
//    public static void main(String[] args) {
//        Random random = new Random();
//        int guess = random.nextInt(100);
//        System.out.println(guess);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("piease type a number:");
//        while (scanner.hasNextInt()){
//            int num = scanner.nextInt();
//            if (num < guess){
//                System.out.println("small");
//            }
//            else if (num>guess){
//                System.out.println("big");
//            }
//            else{
//                System.out.println("right!");
//                break;
//            }
//        }
//    }
}
