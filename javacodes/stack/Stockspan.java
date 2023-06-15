import java.util.*;

public class Stockspan {
    public static void main(String []args){
        int []arr={13,15,12,14,16,8,6,4,10,30};
        int n=arr.length;
        ArrayDeque<Integer>st=new ArrayDeque<Integer>();
        st.push(0);
        System.out.print("1 ");
        for(int i=1;i<n;i++){
            while(st.isEmpty()==false && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()==true){
                System.out.print((i+1)+" ");
            }
            else{
                System.out.print((i-st.peek())+" ");
            }
            st.push(i);
        }
    }   
}
