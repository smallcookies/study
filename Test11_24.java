package homework;

public class Test11_24 {
    //  // 8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。
//  public static void main(String[] args) {
//      int i = 1;
//      int j = 0;
//      for (i= 1;i<=100;i++){
//          if (i%10 == 9)j++;
//          if (i/10 == 9)j++;
//      }
//      System.out.println("出现数字9的整数一共有："+j+"个");
//  }





////9. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和
////    确好等于该数本身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
//public static void main(String[] args) {
//    int i = 0;
//    int a = 0;
//    int b = 0;
//    int c = 0;
//    for (i=0;i<=999;i++){
//        a = i/100;
//        b = (i-a*100)/10;
//        c = (i-a*100)%10;
//        if (i== a*a*a + b*b*b+ c*c*c) {
//            System.out.println(i);
//        }
//    }
//}




//    //10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,
////    密码错误，可以重新输入，最多输入三次。三次均错，则提示退出程序
//    public static void main(String[] args) {
//        int mima = 123456;
//        Scanner sc = new Scanner(System.in);
//        int typeNumber = 0;
//        while(sc.hasNextInt()){
//            int number = sc.nextInt();
//            typeNumber++;
//            if (number == mima){
//                System.out.println("登陆成功！");
//                break;
//            }
//            else if (typeNumber < 3){
//                System.out.println("输入错误！");
//            }
//            else if (typeNumber == 3){
//                System.out.println("密码输入错误三次，已锁定！");
//                break;
//            }
//        }
//    }

}
