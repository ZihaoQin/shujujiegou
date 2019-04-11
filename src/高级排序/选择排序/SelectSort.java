package 高级排序.选择排序;

/**
 * @ClassName:SelectSort.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/8 12:09
 * @Version 1.0
 */
public class SelectSort {
    public static void selectSort(int[] source){
        for (int i=0;i<source.length;i++) {
            for (int j=i+1;j<source.length;j++) {
                if (source[i] > source[j]) {
                    swap(source,i,j);
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
        selectSort(a);
        System.out.println(a.length);
        for (int i=0; i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }

}
