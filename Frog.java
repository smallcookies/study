package JAVA11_23;

public class Frog {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print(frogJump(i) + " ");
        }
    }
    // 青蛙跳台阶问题(提示, 使用递归)
    // 一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。
    // 求该青蛙跳上一个n 级的台阶总共有多少种跳法

    // f(1) = 1,f(2) = 2,
    // n = 3, f(2) + f(1)
    // n = 4, f(3) + f(2)
    public static int frogJump(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return frogJump(n - 1) + frogJump(n - 2);
    }
}
