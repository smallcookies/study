package homework;

import java.util.Scanner;

class Calculator{
    public double num1;
    public double num2;

    public void add(){
        System.out.println(num1+ "+"+ num2 +"=" +(num1+num2));
    }
    public void minus() {
        System.out.println(num1+ "-" +num2+ "=" +(num1-num2));
    }
    public void multiplication(){
        System.out.println(num1+ "*" +num2+ "=" +(num1*num2));
    }
    public void division(){
        System.out.println(num1+ "/" +num2+ "=" +(num1/num2));
    }
}
public class Test12_1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        calculator.num1 = sc.nextDouble();
        calculator.num2 = sc.nextDouble();
        calculator.add();
        calculator.minus();
        calculator.multiplication();
        calculator.division();
        sc.close();
    }
}
