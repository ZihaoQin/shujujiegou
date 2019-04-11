package 高级排序.插入排序;

/**
 * @ClassName:SelectSort.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/8 12:27
 * @Version 1.0
 */
public class SelectSort {
    public static void selectSort(int[] source){
        for(int i=1;i<source.length;i++) {
            //令j=i，确定要比较的数组长度
            for (int j=i;(j>0)&&(source[j]<source[j-1]);j--) {
                swap(source, j, j - 1);
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
