public class segragrate012 {

    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        if(head==null || head.next==null){
            return head;
        }
        Node one=null;
        Node onehead=null;
        Node zero=null;
        Node zerohead=null;
        Node two=null;
        Node twohead=null;
        while(head!=null){
            if(head.data==1){
                if(one==null){
                    one=head;
                    onehead=head;
                }
                else{
                    one.next=head;
                    one=head;
                }
                
            }
            else if(head.data==2){
                if(two==null){
                    two=head;
                    twohead=head;
                }
                else{
                    two.next=head;
                    two=head;
                }
                
            }
            else{
                if(zero==null){
                    zero=head;
                    zerohead=head;
                }
                else{
                    zero.next=head;
                    zero=head;
                }
            }
            head=head.next;
        }
       
        if(zero==null){
            if(one==null){
                return twohead;
            }
            else{
                one.next=twohead;
                
            }
        }
        else{
            if(one==null){
                if(two==null){
                    return zerohead;
                }
                else{
                    zero.next=twohead;
                }
            }
            else{
                zero.next=onehead;
                one.next=twohead;
            }
        }
        // if(one!=null){
            // zero.next
        // }
        return zerohead;
        // add your code here
    }
}
