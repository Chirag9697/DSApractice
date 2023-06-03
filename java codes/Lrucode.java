import java.util.*;
// import java,lang.*;
class Node{
    int data;
    int key;
    Node next;
    Node prev;
    Node(int data,int key){
        data=data;
        key=key;
        next=null;
        prev=null;
    }
}
class Lru{
    // int data;
    // int key;
    int capacity;
    HashMap<Integer,Node>hs=new HashMap<Integer,Node>();
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    Lru(int _capacity){
        capacity=_capacity;
        head.next=tail;
        tail.prev=head;
    }
    int get(int key){
        if(hs.containsKey(key)==true){
            Node n1=hs.get(key);
            hs.remove(key);
            removenode(n1);
            addnode(n1);
            hs.put(key,head.next);
            return n1.data;
        }
        return -1;
    }
    void put(int key,int data){
        if(hs.containsKey(key)==true){
            Node n1=hs.get(key);
            hs.remove(key);
            removenode(n1);
            // Node newnode=new Node(key,data);
            // addnode(newnode);
        }
        if(hs.size()==capacity){
            hs.remove(tail.prev.key);
            removenode(tail.prev);
        }
        addnode(new Node(key,data));
        // System.out.print("hello");
        hs.put(key,head.next);
        System.out.print(head.next.next.data);     
    }
    void removenode(Node n){
        n.prev.next=n.next;
        n.next.prev=n.prev;
    }
    void addnode(Node n){
        System.out.print("hello");
        n.next=head.next;
        head.next.prev=n;
        head.next=n;
        n.prev=head;
    }
}
class Lrucode
{
	public static void main(String[] args) {
        Lru l=new Lru(3);
        l.put(1,1);
        System.out.print(l.get(1));
        // l.put(3,15);
        // l.put(2,12);
        // l.put(4,20);
        // System.out.print(l.get(2));
        // l.put(4,25);
	}
}
