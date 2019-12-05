package JAVA11_23;

public class HanoTower {
    static int count = 0;
    public static void main(String[] args) {
        int n = 3;
        char[] towers = {'A','B','C'};
        hanoTower(n,towers[0],towers[1],towers[2]);
    }
    // 将编号为diskNumber的盘子由sourceTower移动到destTower
    public static void move(int diskNumber,char sourceTower,char destTower) {
        count ++;
        System.out.println("移动次数为"+count+",编号为"+diskNumber+"的盘子从"+sourceTower+ "移动到"+destTower);
    }
    // 实现汉诺塔游戏
    // 并且规定，任何时候，在小圆盘上都不能放大圆盘，
    // 且在三根柱子之间一次只能移动一个圆盘。
    public static void hanoTower(int nDisks,char towerA,char towerB,char towerC) {
        if (nDisks == 1) {
            // 将唯一的一个盘子从A -> C
            move(1,towerA,towerC);
        }else {
            // n >= 2
            // 先将 n-1 个盘子从A -> B,C作为辅助
            hanoTower(nDisks-1,towerA,towerC,towerB);
            // 将编号为n从A -> C
            move(nDisks,towerA,towerC);
            // 将n - 1个盘子从 B -> C,A作为辅助
            hanoTower(nDisks - 1,towerB,towerA,towerC);
        }
    }
}
