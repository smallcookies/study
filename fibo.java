package JAVA11_23;
/**
 * @Author: yuisama
 * @Date: 2019/11/23 09:20
 * @Description:
 */
public class fibo {
    public static void main(String[] args) {
        int n = 45;
        long start = System.currentTimeMillis();
        System.out.println(fibo(n));
        long end = System.currentTimeMillis();
        System.out.println("递归函数耗时:"+(end - start)+"ms");
        System.out.println(fiboNonMethon(n));
        }
        // 实现代码: 求斐波那契数列的第 N 项
        // 1,1,2,3,5,8...
        // f(1) = 1,f(2) = 1,f(3) = f(1) + f(2),..f(n) = f(n-1)+f(n-2)
    public static long fibo(int n) {
            if(n == 1) {
                return 1L;
            }
            if (n == 2) {
                return 1L;
            }
            // n >= 3
            return fibo(n - 1) + fibo(n - 2);
        }

        public static long fiboNonMethon(int n) {
            // 返回当前时间,单位ms
            long start = System.currentTimeMillis();
            if (n == 1 || n== 2) {
                return 1;
            }
            // n >= 3
            else {
                long last1 = 1;
                long last2 = 1;
                long cur = 0;
                for (int i = 3; i <= n; i++) {
                    cur = last1 + last2;
                    last2 = last1;
                    last1 = cur;
                }
                long end = System.currentTimeMillis();
                System.out.println("非递归耗时:"+(end - start) +"ms");
                return cur;
            }
        }
    }

