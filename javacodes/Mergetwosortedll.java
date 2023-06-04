import java.util.*;
import java.lang.*;
class Node{
    int data;
    Node next;
    Node(int _data){
        data=_data;
        next=null;
    }
}
//10 20 30
//5 25
class Mergetwosortedll {
    public static void main(String []args){
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        n1.next=n2;
        n2.next=n3;
        Node n4=new Node(5);
        Node n5=new Node(25);
        n4.next=n5;
     
        Node head=null;
        Node tail=null;
        Node a=null;
        Node b=null;

        if(n1.data<=n4.data){
            head=n1;
            b=head;
            b=b.next;
            a=n4;
        }
        else{
            head=n4;
            a=head;
            a=a.next;
            b=n1;
        }
        tail=head;
        // Node a=n1;
        // Node b=n4;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                tail=a;
                a=a.next;
                // b=b.next;
            }
            else{
                // a=a.next;
                tail.next=b;
                tail=b;
                b=b.next;
                // a=a.next;
                // tail=tail.next;
            }
        }
        if(a==null){
            tail.next=b;
        }
        else{
            tail.next=a;    
        }
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
