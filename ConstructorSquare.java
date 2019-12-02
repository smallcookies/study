package JAVA11_30;

import java.util.concurrent.Callable;

public class ConstructorSquare {
    int age;
    String name;
    static int count;
    public ConstructorSquare(){
        age = 0;
        name = null;
        count = 0;
        System.out.println("1111111");
    }
    { //构造块（实例函数）优先于构造函数执行（先运行）
        age = 10;
        name = "ww";
        count = 1;
        System.out.println("2212121");

    }

    public static void main(String[] args) {
        ConstructorSquare constructorSquare = new ConstructorSquare();
        System.out.println(constructorSquare.age);
        System.out.println(constructorSquare.name);
        System.out.println(constructorSquare.count);
    }
}
