package 高级排序.快速排序;

/**
 * @ClassName:QuickSort2.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2018/10/21 10:26
 * @Version 1.0
 */
class ArrayIns2{
    private long[] theArray;
    private int nElems;

    public ArrayIns2(int max) {
        theArray = new long[max];
        nElems = 0;
    }
    
    public void insert(long value){
        theArray[nElems] = value;
        nElems++;
    }
    public void display(){
        System.out.print("A= ");
        for (int j=0;j<nElems;j++){
            System.out.print(theArray[j] + " ");
        }
        System.out.println("");
    }
    public void quickSort(){
        
        recQuickSort(0,nElems-1);
    }

    private void recQuickSort(int left, int right) {
        int size = right - left + 1;
        if (size <= 3){
            manualSort(left,right);
        }else {
            long median = medianOf3(left,right);
            int partiton = partitionIt(left,right,median);
            recQuickSort(left,partiton-1);
            recQuickSort(partiton+1,right);
        }
    }

    private void manualSort(int left, int right) {
        int size = right - left +1;
        if (size <= 1)
            return;
        if (size == 2){
            if (theArray[left] > theArray[right])
                swap(left,right);
            return;
        }
        else {
            if (theArray[left] > theArray[right-1])
                swap(left, right-1);
            if (theArray[left] > theArray[right])
                swap(left, right);
            if (theArray[right-1] > theArray[right])
                swap(right-1,right);
        }
    }

    private int partitionIt(int left, int right, long pivot) {
        int leftPtr = left;
        int rightPtr = right - 1;
        while (true){
            while (theArray[++leftPtr] < pivot);
            while (theArray[--rightPtr] > pivot);
            if (leftPtr >= rightPtr)
                break;
            else 
                swap(leftPtr,rightPtr);
        }
        swap(leftPtr,right-1);
        return leftPtr;
    }

    private long medianOf3(int left, int right) {
        int center = (left+right)/2;
        if (theArray[left] > theArray[center])
            swap(left,center);
        if (theArray[left] > theArray[right])
            swap(left,right);
        if (theArray[center] > theArray[right])
            swap(center,right);
        swap(center,right-1);
        return theArray[right-1];
    }

    private void swap(int dex1, int dex2) {
        long temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
}

public class QuickSort2 {
    public static void main(String[] args) {
        int maxSize = 16;
        ArrayIns2 arr;
        arr = new ArrayIns2(maxSize);
        for (int j=0;j<maxSize;j++){
            long n = (int)(Math.random()*99);
            arr.insert(n);
        }
        arr.display();
        arr.quickSort();
        arr.display();
    }
}
