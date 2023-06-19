import java.util.*;
public class Largesthistogrampart2 {
   public static void main(String []args){
        ArrayDeque<Integer>st=new ArrayDeque<Integer>();
        int []arr={60,20,50,40,10,50,60};
        int n=arr.length;
        // st.push(0);
        int res=-1;
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                int tp=st.pop();
                int curr=arr[tp]*(st.isEmpty()==true?i:(i-st.peek()-1));
                res=Math.max(res,curr);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
          int tp=st.pop();
          int curr=arr[tp]*(st.isEmpty()==true?n:(n-st.peek()-1));
          res=Math.max(res,curr);
        }
        System.out.print(res);
   } 
}
