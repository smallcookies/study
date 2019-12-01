package JAVA11_30;

import java.security.AlgorithmParameterGenerator;

class StaticState {
    int age;
    String name;
    static int count;
    public StaticState(){
        System.out.println("2122112");
    }
    //  构造块（实例代码块）
     {
         age = 0;
         name = "aa";
         count = 0;
         System.out.println("11111111");
     }
     static {
        count = 10;
        System.out.println("3333333");
     }

    public static void main(String[] args) {
        StaticState staticState = new StaticState();
        StaticState staticState1 = new StaticState();
        System.out.println(staticState);
        System.out.println(staticState1);
    }
}
