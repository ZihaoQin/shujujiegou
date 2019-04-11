package 高级排序.希尔排序;

/**
 * @ClassName:ShellSort2.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/8 15:23
 * @Version 1.0
 */
public class ShellSort2 {
    public static void sort(long[] arr) {
        //初始化一个间隔
        int h = 1;
        //计算最大间隔
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            //进行插入排序
            long tmp = 0;
            for (int i = h; i < arr.length; i++) {
                tmp = arr[i];
                int j = i;
                while (j > h-1 && arr[j - h] >= tmp) {
                    arr[j] = arr[j - h];
                    j -= h;
                }
                arr[j] = tmp;
            }
            //减小间隔
            h = (h - 1) / 3;
        }
    }

    public static void main(String[] args) {
        long[] a = {2, 85, 6, 3, 78, 19, 48, 31, 3, 88, 32, 68, 38, 18, 648};
        sort(a);
        System.out.println(a.length);
        for (long ad:a) {
            System.out.print(ad + " ");
        }
    }
}
