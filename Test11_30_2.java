package JAVA11_30;

class Account {
    // 账户ID
    private int id;
    // 账户密码
    private String password;
    // 余额
    private double sal;

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public double getSal() {
        return sal;
    }

    public Account(int id, String password, double sal) {
        this.id = id;
        this.password = password;
        this.sal = sal;
    }
    // alt + enter


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sal=" + sal +
                '}';
    }


}


public class Test11_30_2 {
    public static void main(String[] args) {
        Account account = new Account(123456,"test",0.0);
        // 输出银行卡信息
//        System.out.println("id为"+account.getId()+",密码为:"+account.getPassword()+
//                ",余额为:"+account.getSal());
        System.out.println(account);
        // 匿名对象
        System.out.println(new Account(345,"test1",0.0));
    }
}
