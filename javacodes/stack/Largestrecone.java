import java.util.*;

public class Largestrecone {
    static int largesthist(ArrayList<Integer>arr){   
        int n=arr.size();
        ArrayList<Integer>ns=new ArrayList<Integer>();
        ArrayList<Integer>ps=new ArrayList<Integer>();
        ps.add(-1); 
        ns.add(n);
        ArrayDeque<Integer>st1=new ArrayDeque<Integer>();
        ArrayDeque<Integer>st2=new ArrayDeque<Integer>();
        st1.push(0);
        st2.push(n-1);
        for(int i=1;i<n;i++){
           while(st1.isEmpty()==false && arr.get(st1.peek())>=arr.get(i)){
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
        // System.out.println(ps);
        for(int i=n-2;i>=0;i--){
            while(st2.isEmpty()==false && arr.get(st2.peek())>=arr.get(i)){
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
        // System.out.println(ns);
        int res=-1;
        for(int i=0;i<n;i++){
            int curr=arr.get(i);
            curr=curr+arr.get(i)*(i-ps.get(i)-1);
            curr=curr+arr.get(i)*(ns.get(ns.size()-i-1)-i-1);
            res=Math.max(res,curr);
        }
        // System.out.print(res);
        return res;
    }
    public static void main(String []args){
        // int [][]arr=new int[4][4];   
        Scanner sc=new Scanner(System.in);
        int n=4;
        int m=4;
        ArrayList<ArrayList<Integer>>matrix=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            matrix.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                int num=sc.nextInt();
                matrix.get(i).add(num);
            }
        }
        int res=-1;
        res=Math.max(res,largesthist(matrix.get(0)));
        // ArrayDeque<Integer>ns=new ArrayDeque<Integer>();
        // ArrayDeque<Integer>ps=new ArrayDeque<Integer>();
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
               if(matrix.get(i).get(j)==1){
                    int b=matrix.get(i).get(j)+1;
                    matrix.get(i).set(j,b);
               }    
            }
            res=Math.max(res,largesthist(matrix.get(i)));
        }
        System.out.print(res);

    }   
}
