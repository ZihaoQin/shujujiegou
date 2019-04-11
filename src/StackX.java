/**
 * @ClassName:StackX.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2018/10/9 23:39
 * @Version 1.0
 */
public class StackX {
    private int maxSize;  //size of stack array
    private long[] stackArray;
    private int top;  //top of stack

    public StackX(int s){  //constructor
        maxSize = s;   //set array size
        stackArray = new long[maxSize]; //create array
        top = -1;       //no items yet
    }

    public void push(long j){        //put item on top of stack
        stackArray[++top] = j;          //increment top,insert item
    }

    public long pop(){                  //take item from top of stack
        return stackArray[top--];          //access item,decrement top
    }

    public long peek(){
        return stackArray[top];          //peek at top of stack
    }

    public boolean isEmpty(){             //true if stack is empty
        return (top == -1);
    }

    public boolean isFull(){             //true if stack is full
        return (top == maxSize-1);
    }

    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty()){ //until it is empty
            long value = theStack.pop();
            System.out.println(value);
            System.out.println("    ");
        }
        System.out.println("");
    }
}
