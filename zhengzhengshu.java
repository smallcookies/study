package homework;

import java.util.Scanner;

public class zhengzhengshu {

    public static int Put1(int num){
        int j=0;
        for (int i=0;i<10;i++){
            if(num!=0){
                num/=10;
                j++;
            }
            else break;
        }
        return j;
    }
    public static void Put2(int num){
        int n=Put1(num);
        int a[] = new int[n+1];
        for (int i=0;i<a.length;i++) {
            a[i]=num%10;
            num/= 10;
        }
        for (n-=1;n>=0;n--){
            System.out.print(a[n]+" ");
        }
        System.out.println();
    }
    public static void Put3(int num){
        int j=Put1(num);
        int n=Put1(num);
        int sum=0;
        for (int i=0;i<n;i++) {
            int k=num%10;
            num/=10;
            sum+=k*Math.pow(10,j-1);
            j--;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        while (true){
            System.out.println("请输入一个不大于10位的正整数：");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if(num<Math.pow(10,9)&&num>0){
                System.out.println("输入的数为"+Put1(num)+"位数");
                Put2(num);
                Put3(num);
            }
            else {
                System.out.println("请重新输入！");
            }
        }
    }
}
