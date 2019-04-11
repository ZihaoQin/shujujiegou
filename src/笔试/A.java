package 笔试;

/**
 * @ClassName:A.java
 * @Description:TODO （）
 * @Author:qzh
 * @Date: 2018/10/11 21:25
 * @Version 1.0
 */
class A {
    static {
        System.out.println("a");
    }
    public A(){
        System.out.println("b");
    }
}

class B extends A{
    static {
        System.out.println("c");
    }
    public B(){
        System.out.println("d");
    }
}

class Dahua{
    public static void main(String[] args) {
        A b = new B();
        b = new B();
    }
}
