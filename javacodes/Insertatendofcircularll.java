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
class Insertatendofcircularll {
    public static void main(String []args){
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        n1.next=n2;
        n2.next=n3;
        n3.next=n1;
        Node newnode=new Node(15);
        newnode.next=n1.next;
        n1.next=newnode;
        //same as insert at begin of ccll
        System.out.print(n1.data);
    }
}
