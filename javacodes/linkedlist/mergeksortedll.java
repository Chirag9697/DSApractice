class mergeksortedll
{
    static Node merge(Node first,Node second){
        // Node dummy=new Node(-1){
       Node tail=null;
       if(first==null){
           return second;
       }
       if(second==null){
           return first;
       }
        if(first.data<=second.data){
            tail=first;
            tail.next=merge(first.next,second);
        }
        else{
            tail=second;
            tail.next=merge(first,second.next);
        }
        
        return tail;
    }
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        int last=K-1;
        int i=0;
        while(last!=0){
            i=0;
            int j=last;
            while(i<j){
                arr[i]=merge(arr[i],arr[j]);
                i++;
                j--;
                if(j<=i){
                    last=j;
                }
            }
            
        }
        // arr[0]=merge(arr[0],arr[1]);
        return arr[0];
    }
}
