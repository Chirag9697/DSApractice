class Solution
{
    static Node merge(Node h1,Node h2){
        if(h2==null){
            return h1;
        }
        if(h1==null){
            return h2;
        }
        Node dummy=new Node(-1);
        Node ans=dummy;
        while(h1!=null && h2!=null){
            if(h1.data<=h2.data){
                ans.next=h1;
                ans=h1;
                h1=h1.next;
            }
            else{
                ans.next=h2;
                ans=h2;
                h2=h2.next;
            }
        }
        while(h1!=null){
            ans.next=h1;
            h1=h1.next;
        }
        while(h2!=null){
            ans.next=h2;
            h2=h2.next;
        }
        return dummy.next;
    }
    static Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
   
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
          if(head==null || head.next==null){
            return head;
        }
        Node mid=findmid(head);
        Node second=mid.next;
        // mid.next.prev=null;
        mid.next=null;
        Node first=head;
        
        
        Node left=mergeSort(first);
        Node right=mergeSort(second);
        Node ans=merge(left,right);
        return ans;
    }
}