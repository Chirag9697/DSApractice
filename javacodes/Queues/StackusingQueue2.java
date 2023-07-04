import java.util.*;
//1 2 3 4
// 1 2 3 4
class Stackqu{
    Queue<Integer>q1=new LinkedList<>();
    Queue<Integer>q2=new LinkedList<>();
    Stackqu(){

    }
    int pop(){
        int a=-1;
        while(q1.size()>1){
            a=q1.remove();
            q2.add(a);
        }
        a=q1.remove();
        // q2.remove();
        // int a=q2.
        while(q2.isEmpty()==false){
            q1.add(q2.remove());
        }
        q1.remove();
        return a;
    }
    void push(int x){
        q1.add(x);
    }
}
class StackusingQueue2 {
    public static void main(String []args){
        System.out.println("stack");
        Stackqu s=new Stackqu();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.print(s.pop());
        System.out.print(s.pop());


    }    
}
