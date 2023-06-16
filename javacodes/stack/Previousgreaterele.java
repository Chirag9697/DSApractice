import java.util.*;
public class Previousgreaterele {
    public static void main(String []args){
        int []arr={15,10,18,12,4,6,2,8};
        int n=arr.length;
        ArrayDeque<Integer>st=new ArrayDeque<Integer>();
        st.push(0);
        System.out.print(-1+" ");
        for(int i=1;i<n;i++){
            while(st.isEmpty()==false &&  arr[st.peek()]<=arr[i]){
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
