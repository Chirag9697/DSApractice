import java.util.*;
class Reverseaqueue {
    static void reversequeue(Queue<Integer>q1){
        if(q1.isEmpty()==true){
            return;
        }
        int a=q1.remove();
        reversequeue(q1);
        q1.add(a);
    }
    public static void main(String []args){
            Queue<Integer>q1=new LinkedList<>();
            q1.add(1);
            q1.add(2);
            q1.add(3);
            q1.add(4);
            q1.add(5);
            reversequeue(q1);
            System.out.println(q1.remove());
    }    
}
