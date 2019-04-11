package 单链表;

/**
 * @ClassName:Link.java
 * @Description:TODO （查找删除指定链结点）
 * @Author:qzh
 * @Date: 2018/10/15 9:30
 * @Version 1.0
 */
public class Link2 {          //创建一个链结点
    public int iData;
    public double dData;
    public Link2 next;

    public Link2(int id,double dd){
        iData = id;
        dData = dd;
    }

    public void displayLink(){
        System.out.print("{"+iData+","+dData+"}");
    }
}

//创建一个单链表
class LinkList2{
    private Link2 first;
    public LinkList2(){
        first = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int id,double dd){
        Link2 newLink = new Link2(id,dd);
        newLink.next = first;          //old first   初始时为null
        first = newLink;
    }

    public Link2 find(int key){
        Link2 current = first;
        while (current.iData != key){
            if (current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }

    public Link2 delete(int key){
        Link2 current = first;
        Link2 previous = first;
        while (current.iData != key){
            if (current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
    }

    public Link2 deleteFirst(){
        Link2 temp = first;
        first = first.next;
        return temp;
    }

    public void displayLink(){
        System.out.print("List(first-->last):");
        Link2 current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

}

class LinkListApp2{
    public static void main(String[] args) {
        LinkList2 theList = new LinkList2();
        theList.insertFirst(22,2.99);
        theList.insertFirst(23,3.99);
        theList.insertFirst(24,6.99);
        theList.insertFirst(25,8.99);

        theList.displayLink();

        Link2 f = theList.find(23);
        if (f != null)
            System.out.println("Found link with key "+f.iData);
        else
            System.out.println("Can't find link");

        Link2 d = theList.delete(23);
        if (d != null)
            System.out.println("Deleted link with key "+d.iData);
        else
            System.out.println("Can't delete link");

        theList.displayLink();
    }
}
