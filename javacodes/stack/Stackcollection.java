import java.util.ArrayDeque;

public class Stackcollection {
    public static void main(String []args){
          // System.out.print(m.pop());
        ArrayDeque<Integer>a=new ArrayDeque<Integer>();
        a.push(10);
        a.push(20);
        a.push(30);
        System.out.print(a.pop());
        System.out.print(a.peek());
    }   
}
