package JAVA11_30;

    // 普通类
    class Person {
        int age;
        String name;
        static String country = "中华民国";

//    public Person() {
//        System.out.println("hehe");
//    }

        public Person(int age) {
            this.age = age;
        }
        public Person(int age,String name) {
            this.name = name;
        }

    }


    // 主类
    public class Test11_30_1 {
        public static void main(String[] args) {
            Person per1 = new Person(18);
            Person per2 = new Person(18,"peter");
        }
    }

