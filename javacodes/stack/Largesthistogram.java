import java.util.*;
import java.lang.*;
public class Largesthistogram {
   public static void main(String []args){
        int []arr={6,2,5,4,1,5,6};
        int n=arr.length;
        ArrayList<Integer>ns=new ArrayList<Integer>();
        ArrayList<Integer>ps=new ArrayList<Integer>();
        ps.add(-1); 
        ns.add(n);
        ArrayDeque<Integer>st1=new ArrayDeque<Integer>();
        ArrayDeque<Integer>st2=new ArrayDeque<Integer>();
        st1.push(0);
        st2.push(n-1);
        for(int i=1;i<n;i++){
           while(st1.isEmpty()==false && arr[st1.peek()]>=arr[i]){
                st1.pop();
           }
           if(st1.isEmpty()==true){
                ps.add(-1);
           }
           else{
                ps.add(st1.peek());
           }
           st1.push(i);
        }
        System.out.println(ps);
        for(int i=n-2;i>=0;i--){
            while(st2.isEmpty()==false && arr[st2.peek()]>=arr[i]){
                st2.pop();
            }
            if(st2.isEmpty()==true){
                ns.add(n);
            }
            else{
                ns.add(st2.peek());
            }
            st2.push(i);
        }
        System.out.println(ns);
        int res=-1;
        for(int i=0;i<n;i++){
            int curr=arr[i];
            curr=curr+arr[i]*(i-ps.get(i)-1);
            curr=curr+arr[i]*(ns.get(ns.size()-i-1)-i-1);
            res=Math.max(res,curr);
        }
        System.out.print(res);
   } 
}
