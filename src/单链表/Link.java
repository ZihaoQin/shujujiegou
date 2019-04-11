package 单链表;

/**
 * @ClassName:Link.java
 * @Description:TODO （简单单链表）
 * @Author:qzh
 * @Date: 2018/10/15 9:30
 * @Version 1.0
 */
public class Link {          //创建一个链结点
    public int iData;
    public double dData;
    public Link next;

    public Link(int id,double dd){
        iData = id;
        dData = dd;
    }

    public void displayLink(){
        System.out.print("{"+iData+","+dData+"}");
    }
}

//创建一个单链表
class LinkList{
    private Link first;
    public LinkList(){
        first = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int id,double dd){
        Link newLink = new Link(id,dd);
        newLink.next = first;          //old first   初始时为null
        first = newLink;
    }
    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayLink(){
        System.out.print("List(first-->last):");
        Link current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

}

class LinkListApp{
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(22,2.99);
        theList.insertFirst(23,3.99);
        theList.insertFirst(24,6.99);
        theList.insertFirst(25,8.99);

        theList.displayLink();
        while (!theList.isEmpty()){
            Link aLink = theList.deleteFirst();
            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }
    }
}
