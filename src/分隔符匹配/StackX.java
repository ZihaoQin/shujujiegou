package 分隔符匹配;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName:StackX.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2018/10/10 9:23
 * @Version 1.0
 */
public class StackX {
    private int maxSize;  //size of stack array
    private char[] stackArray;
    private int top;  //top of stack

    public StackX(int s){  //constructor
        maxSize = s;   //set array size
        stackArray = new char[maxSize]; //create array
        top = -1;       //no items yet
    }

    public void push(char j){        //put item on top of stack
        stackArray[++top] = j;          //increment top,insert item
    }

    public char pop(){                  //take item from top of stack
        return stackArray[top--];          //access item,decrement top
    }

    public char peek(){
        return stackArray[top];          //peek at top of stack
    }

    public boolean isEmpty(){             //true if stack is empty
        return (top == -1);
    }

    public boolean isFull(){             //true if stack is full
        return (top == maxSize-1);
    }
}

class BracketChecker{
    private String input;
    public BracketChecker(String in){
        input = in;
    }
    public void check(){
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int j=0;j<input.length();j++){
            char ch = input.charAt(j);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()){
                        char chx = theStack.pop();
                        if ((ch == '}' && chx != '{') ||
                                (ch == ']' && chx != '[') ||
                                (ch == ')' && chx != '('))
                            System.out.println("Error: "+ch+" at "+j);
                    }
                    else
                        System.out.println("Error: "+ch+" at "+j);
                    break;
                    default:
                        break;
            }
        }
        if (!theStack.isEmpty())
            System.out.println("Error:missing right delimiter");
    }
}

class BracketsApp{
    public static void main(String[] args) throws IOException {
        String input;
        while (true){
            System.out.println("Enter string containing delimiters");
            System.out.flush();
            input = getString();
            if (input.equals("")){
                break;
            }
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
