import java.util.*;
class stack{
    Queue<Integer>q1=new LinkedList<>();
    Queue<Integer>q2=new LinkedList<>();
    int top(){
        return q1.peek();
    }
    void push(int a){
        
        while(q1.isEmpty()==false){
            q2.add(q1.remove());    
        }
        q1.add(a);
        while(q2.isEmpty()==false){
            q1.add(q2.remove());
        }
    }
}
class StackusingQueue
{
	public static void main(String[] args) {
	    stack s1=new stack();
	    s1.push(1);
	    s1.push(2);
	    System.out.print(s1.top());
	}
}
