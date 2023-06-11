class Insertatmiddle {
     Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node slow=head;
        Node fast=head;
        Node n1=new Node(data);
        while(fast!=null && fast.next!=null  && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        n1.next=slow.next;
        slow.next=n1;
        return head;
        
    }    
}
