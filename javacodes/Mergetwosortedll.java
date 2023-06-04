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
    // static Node mergesortedll(Node head1,Node head2){
    //     if(head1==null && head2==null){
    //         return null;
    //     }
    //     if(head1==null){
    //         return head2;
    //     }
    //     if(head2==null){
    //         return head1;
    //     }
    //     if(head1.data<head2.data){
    //         head1=head1.next;
    //     }

    //     return head1;   
    // }
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
        }
        else{
            head=n4;
            a=head;
            a=a.next;
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
