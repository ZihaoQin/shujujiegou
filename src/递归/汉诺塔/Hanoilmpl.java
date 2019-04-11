package 递归.汉诺塔;

/**
 * @ClassName:Hanoilmpl.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2018/10/18 11:04
 * @Version 1.0
 */
public class Hanoilmpl {
    public void hanoi2(int n, char A, char B, char C) {
        if (n == 1) {
            move(A, C);
        } else {
            hanoi2(n - 1, A, C, B);//步骤1 按ACB数序执行N-1的汉诺塔移动
            move(A, C);             //步骤2   执行最大盘子移动
            hanoi2(n - 1, B, A, C);//步骤3 按BAC数序执行N-1的汉诺塔移动
        }
    }

    private void move(char A, char C) {//执行最大盘子的从A-C的移动
        System.out.println("move:" + A + "--->" + C);
    }

    public static void main(String[] args) {
        Hanoilmpl hanoi2 = new Hanoilmpl();
        System.out.println("移动汉诺塔的步骤：");
        hanoi2.hanoi2(3, 'a', 'b', 'c');
    }
}
