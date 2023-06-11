class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
//10->20->30
// |______|
class Deleteattheheadofccll {
    public static void main(String []args){
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        n1.next=n2;
        n2.next=n3;
        n3.next=n1;
        Node head=n1;
        Node nextnode=head.next;
        int temp=head.data;
        head.data=nextnode.data;
        nextnode.data=temp;
        head.next=nextnode.next;
        System.out.println(head.data);

    }
}
