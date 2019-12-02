package JAVA11_30;

class TestSquare {
    static int count;
    public TestSquare() {
        System.out.println("1.TestSquare的构造方法..");
    }

    {
        System.out.println("2.TestSquare的构造块..");
    }

    static {
        System.out.println("3.TestSquare的静态块..");
    }
}


public class StaticSquare {
    public StaticSquare() {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    static {
        System.out.println("3");
    }
    public static void main(String[] args) {
        System.out.println("4");
        StaticSquare staticSquare = new StaticSquare();
    }
}
