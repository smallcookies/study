package homework;

import java.util.Scanner;

public class sushu {
    public static void main(String[] arge){
    while(true){
        System.out.println("请输入一个小于1000的正数：");
        Scanner scanner=new Scanner(System.in);
        double i = scanner.nextDouble();
        if (i>1000||i<0){
            System.out.println("请重新输入！");
            break;
        }
        System.out.println(Math.sqrt(i));
    }
    }

}
