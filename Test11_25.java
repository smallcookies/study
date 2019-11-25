package homework;

public class Test11_25 {
    //11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
//    //主方法
//    public static void main(String[] args){
//        int count = 0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("请输入您想要输入的值:");
//        int num = in.nextInt();  //接收数据
//        count = findBinary1(num);  //调用找一个整数中二进制位为1的个数的方法
//        System.out.println(num+"中有"+count+"个1.");
//    }
//    //找一个整数中二进制位为1的个数的方法
//    public static int findBinary1(int num){
//        int count = 0;
//        for (int i = num; i != 0; i >>= 1){  //若i不等于0,遍历其每一个二进制位
//            if ((i & 1) == 1){
//                count++;  //二进制位为1的个数加1
//            }
//        }
//        return count;
//    }






////(1)12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
//public static void main(String[] args) {
//    int value = 11;
//    int[] arr1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
//    int[] arr2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
//    int j=0;
//    for(int i=0;i<32;i+=2){
//        arr1[j]=(value>>i)&1;
//        j++;
//    }
//        j=0;
//    for(int i=1;i<32;i+=2){
//        arr2[j]=(value>>i)&1;
//        j++;
//    }
//    for(int i=15;i>=0;i--){
//        System.out.print(arr1[i]);
//    }
//    System.out.println("");
//
//    for(int i=15;i>=0;i--){
//        System.out.print(arr2[i]);
//    }
//  }
//   // (2)12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
//    //  以11为例子，
//    // 11：0000 0000 0000 0000 0000 0000 0000 1011
//    // 奇数位序列：0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
//    // 偶数位序列：0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1
//     public static void main(String[] args) {
//         int value=11;
//         System.out.println("偶数序列");
//         for(int i=31;i>0;i-=2){
//             System.out.print((value>>i)&1);
//         }
//         System.out.println("");
//         System.out.println("奇数序列");
//         for(int i=30;i>=0;i-=2){
//             System.out.print((value>>i)&1);
//         }
//     }

}
