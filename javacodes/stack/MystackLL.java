import java.util.*;
// import java.lang.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class Mystack{
    int size;
    Node head;
    Mystack(){
        size=0;
        head=null;
    }
    void push(int x){
        Node newNode=new Node(x);
        newNode.next=head;
        head=newNode;
        size++;
    }
    int pop(){
        if(head==null){
            return -1;
        }
        int x=head.data;
        head=head.next;
        return x;
    }
    int size(){
        return size;
    }

}
public class MystackLL{
    public static void main(String []args){
        Mystack m=new Mystack();
        m.push(10);
        m.push(11);
        m.push(12);
        System.out.print(m.pop());

    }
}