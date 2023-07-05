import java.util.*;
class queuestack{
    ArrayDeque<Integer>s=new ArrayDeque<Integer>();
    queuestack(){

    }
    void push(int x)
    {
        s.push(x);
    }
    int pop(){
        if(s.isEmpty()==true){
            return -1;
        }
        int b=s.peek();
        s.pop();
        int a=pop();
        if(a==-1){
            return b;
        }
        else{
            s.push(b);
        }
        return a;
        // return pop();
    }
}
class Queueusingstack {
    public static void main(String []args){
            queuestack q=new queuestack();
            q.push(1);
            q.push(2);
            System.out.println(q.pop());
            System.out.println(q.pop());
    }
}
