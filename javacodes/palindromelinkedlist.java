class Node{
    char data;
    Node next;
    Node(char d){
        data=d;
        next=null;
    }
}

class palindromelinkedlist {
    static Node reverse(Node head){
        Node nextnode=null;
        Node prev=null;
        while(head!=null){
            nextnode=head.next;
            head.next=prev;
            prev=head;
            head=nextnode;
        }
        return prev;
    }
    public static void main(String []args){
        Node n1=new Node('R');
        Node n2=new Node('A');
        Node n3=new Node('D');
        Node n4=new Node('A');
        Node n5=new Node('R');
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        // System.out.print(palindrome(n1, n1));
        Node fast=n1;
        Node slow=n1;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next=reverse(slow.next);
        // System.out.print(slow.next.data);
        Node head1=n1;
        Node head2=slow.next;
        int flag=0;
        while(head2!=null){
            if(head1.data!=head2.data){
                flag=1;
                System.out.print(false);
                break;
            }
            head2=head2.next;
            head1=head1.next;
        }
        if(flag==0){

            System.out.print(true);
        }

    }     
}
