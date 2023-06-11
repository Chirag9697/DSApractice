class Mystack{
    int capacity;
    int arr[];
    int top;
    Mystack(int cap){
        capacity=cap;
        arr=new int[cap];
        top=-1;
    }
    int isEmpty(){
        if(top==-1){
            return 1;
        }
        return 0;
    }
    int isfull(){
        if(top==capacity-1){
            return 1;
        }
        return 0;
    }
    int peek(){
        if(isEmpty()==1){
            return -1;
        }
        return arr[top];
    }
    int pop(){
        if(isEmpty()==1){
            return -1;
        }
        return arr[top--];
    }
    int size(){
        return top+1;
    }
    void push(int val){
        if(isfull()==0){
            top++;
            arr[top]=val;
            // System.out.println(arr[top]);
        }
    }
}
class Stack{
    public static void main(String []args){
        Mystack m=new Mystack(5);
        m.push(10);
        m.push(11);
        System.out.print(m.pop());
    }
}