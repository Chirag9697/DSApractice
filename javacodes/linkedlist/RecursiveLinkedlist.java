class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class RecursiveLinkedlist {
    static Node reversinglinkedlist(Node head){
        if(head.next==null){
            return head;
        }
        Node mainhead=reversinglinkedlist(head.next);
        Node nextnode=head.next;
        nextnode.next=head;
        head.next=null;
        return mainhead;
        // return head;
    }
    public static void main(String []args){
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        Node head=reversinglinkedlist(n1);
        System.out.print(head.data);
    }       
}
