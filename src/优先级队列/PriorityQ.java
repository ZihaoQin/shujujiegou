package 优先级队列;

/**
 * @ClassName:PriorityQ.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2018/10/11 19:49
 * @Version 1.0
 */
public class PriorityQ {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQ(int s){
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item){
        int j;
        if (nItems == 0)
            queArray[nItems++] = item;
        else {
            for (j=nItems-1;j>=0;j--){
                if (item > queArray[j])
                    queArray[j+1] = queArray[j];
                else
                    break;
            }
            queArray[j+1] = item;          //不是很懂！！！   跳出for循环后j的值是什么？
            System.out.println("j的值："+j);
            nItems++;
        }
    }

    public long remove(){
        return queArray[--nItems];
    }
    public long peekMin() {
        return queArray[nItems - 1];
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }
    public boolean isFull(){
        return (nItems == maxSize);
    }
}

class PriorityQApp{
    public static void main(String[] args) {
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while (!thePQ.isEmpty()){
            long item = thePQ.remove();
            System.out.print(item + " "); //10 20 30 40 50
        }
        System.out.println("");
    }
}
