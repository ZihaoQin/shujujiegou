package 高级排序.快速排序;

/**
 * @ClassName:QuickSort.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/9 16:01
 * @Version 1.0
 */
public class QuickSort {
    public static void qsort_asc(int source[], int low, int high) {
        int i, j, x;
        if (low < high) {
            i = low;
            j = high;

            x = source[i];
            while (i < j) {
                while (i < j && source[j] > x) {
                    j--;
                }
                if (i < j) {
                    source[i] = source[j];
                    i++;
                }
                while (i < j && source[i] < x) {
                    i++;
                }
                if (i < j) {
                    source[j] = source[i];
                    j--;
                }
            }
            source[i] = x;
            qsort_asc(source, low, i - 1);
            qsort_asc(source, i + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 18, 3, 8, 6, 1, -4, 61};

        int i;
        qsort_asc(a, 0, a.length - 1);
        for (int b : a) {
            System.out.print(b + " ");
        }
    }
}
