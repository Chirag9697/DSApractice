class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class Nthnode {
    static void printNthFromEnd(Node head,int n){
        if(head==null)return;
        Node first=head;
        for(int i=0;i<n;i++){
            if(first==null)return;
            first=first.next;
        }
        Node second=head;
        while(first!=null){
            second=second.next;
            first=first.next;
        }
        System.out.print(second.data);
    }
    public static void main(String []args){
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        int n=2;
        Node head=n1;


    }    
}
