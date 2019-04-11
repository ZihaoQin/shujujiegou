package 单词逆序;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName:StackX.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2018/10/10 0:11
 * @Version 1.0
 */
class StackX {
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

}

class Reverser{
    private String input;          //input string
    private String output;         //output string

    public Reverser(String in){
        input = in;
    }

    public String doRev(){
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);
        for (int j=0;j<stackSize;j++){
            char ch = input.charAt(j);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()){
            char ch = (char) theStack.pop();
            output = output + ch;
        }
        return output;
    }
}

class ReverseApp{
    public static void main(String[] args) throws IOException {
        String input,output;
        while (true){
            System.out.println("Enter a string: ");
            System.out.flush();
            input = getString();
            if (input.equals("")){
                break;
            }
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed: "+output);
        }
    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
