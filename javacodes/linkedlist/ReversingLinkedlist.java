import java.util.*;
import java.lang.*;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int x){
        data=x;
        prev=null;
        next=null;
    }
}
class ReversingLinkedlist {
    static Node reverse(Node head){
        Node nextNode=null;
        Node prev=null;
        while(head!=null){
            nextNode=head.next;
            head.next=prev;
            head.prev=nextNode;
            prev=head;
            head=nextNode;
        }
        return prev;      
    }
    public static void main(String []args){
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        n3.next=n4;
        n4.prev=n3;
        Node head=reverse(n1);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        
    }   
}
