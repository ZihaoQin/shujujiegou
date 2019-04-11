package 高级排序.二分排序;

/**
 * @ClassName:Test.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/9 14:47
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] a = {4, 6, 1, 8, 3, 8, 7, 9, 2, 3, -5, 3, 0};
        int i, j;
        int low, high, mid;
        int temp;
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            low = 0;
            high = i-1;
            while (low <= high) {
                mid = (low + high / 2);
                if (a[mid] > temp) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            for (j=i-1;j>high;j--) {
                a[j + 1] = a[j];
            }
            a[high + 1] = temp;
        }
        for (int aa : a) {
            System.out.println(aa + " ");
        }
    }
}
