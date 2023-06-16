import java.util.*;
public class nextgreater{
    public static void main(String []args){
        int []arr={5,15,10,8,6,12,9,18};
        ArrayDeque<Integer>st=new ArrayDeque<Integer>();
        int n=arr.length;
        st.push(n-1);
        System.out.print(-1+" ");
        for(int i=n-2;i>=0;i--){
            while(st.isEmpty()==false && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()==true){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(arr[st.peek()]+" ");
            }
            st.push(i);
        }

    }
}