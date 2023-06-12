import java.util.*;
class Removeduplicate {
    public static void main(String []args){
        int []arr={1,2,3,4};
        int n=arr.length;
        // System.out.print(n);
        int ptr1=1;
        int ptr2=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            else{
                // int temp=arr[ptr2];
                // arr[ptr2]=arr[ptr1];
                arr[ptr1]=arr[i];
                ptr1++;
                // ptr2++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
