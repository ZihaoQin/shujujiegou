package 高级排序.归并排序;

/**
 * @ClassName:MergeSort.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2019/4/9 19:48
 * @Version 1.0
 */

//O(nlogn)
public class MergeSort {
    public static void merge(int array[], int start1, int end1, int start2, int end2) {
        int i, j;//i,j分别为表1和表2的游标
        {
            i = start1;
            j = start2;
        }
        int k = 0;
        //建立一个临时长度为两个字列表长度之和的数组
        int[] temp = new int[end2 - start1 + 1];
        while (i <= end1 && j <= end2) {
            if (array[i] > array[j]) {
                temp[k++] = array[j++];
            }else {
                temp[k++] = array[i++];
            }

            //把剩下的元素依次放入临时数组中（肯定是只剩下一方）
            while (i <= end1) {
                temp[k++] = array[i++];
            }
            while (j <= end2) {
                temp[k++] = array[j++];
            }
            k = start1;
            for (int ele : temp) {
                array[k++] = ele;
            }
        }
    }

    public static void mergeSort(int array[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            //两路归并
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, mid + 1, end);

            //多路归并
            /*int mid = (start + end) / 4;
            mergeSort(array, start, 1 * mid);
            mergeSort(array, 1 * mid + 1, 2 * mid);
            mergeSort(array, 2 * mid + 1, 3 * mid);
            mergeSort(array, 3 * mid + 1, end);
            merge(array, start, 1 * mid, 1 * mid + 1, 2 * mid);
            merge(array, 2 * mid + 1, 3 * mid, 3 * mid + 1, end);
            merge(array, start, 2 * mid, 2 * mid + 1, end);*/
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 7, 5, 68, 2, 3, 8, 4, 6, 1, 82, -85, 418};

        mergeSort(a, 0, a.length - 1);
        for (int b : a) {
            System.out.print(b + " ");
        }
    }
}
