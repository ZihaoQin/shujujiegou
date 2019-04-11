package 高级排序.冒泡排序;

/**
 * @ClassName:BubbleSort.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/8 11:40
 * @Version 1.0
 */
public class BubbleSort {
    public static void bubblesort(int[] source){
        //把做大值逐步移动至末尾
        for (int i=source.length-1;i>0;i--) {
            for (int j=0;j<i;j++){
                if (source[j] > source[j + 1]) {
                    swap(source, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] source, int x, int y) {
        int temp = source[x];
        source[x] = source[y];
        source[y] = temp;
    }

    public static void main(String[] args) {
        int[] a = {4, 6, 6, 38, 3, -5, 0, 78, 52, 38};
        bubblesort(a);
        System.out.println(a.length);
        for (int i=0; i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
