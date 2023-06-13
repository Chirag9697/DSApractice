class tostack{
    int []arr;
    int cap;
    int top1;
    int top2;
    int l1;
    int l2;
    tostack(int n){
        cap=n;
        arr=new int[cap];
        top1=n/2;
        top2=n/2-1;
        l1=0;
        l2=0;
    }
    void push1(int x){
        if(top1==0){
            System.out.print("Stack one is full");
            return;
        }
        top1--;
        l1++;
        arr[top1]=x;
        return;
    }
    void push2(int x){  
        if(top2==cap-1){
            System.out.print("stack two is full");
            return;
        }
        top2++;
        l2++;
        arr[top2]=x;
        return;
    }
    int pop1(){
        if(top2==cap/2+1){
            return -1;
        }
        return arr[top2++];
    }
    int pop2(){
        if(top2==cap/2){
            return -1;
        }
        return arr[top2--];
    }
    int size1(){
        return l1;
    }
    int size2(){
        return l2;
    }

}
public class Twostack{
    public static void main(String []args){
        tostack t=new tostack(6);
        t.push1(10);
        t.push1(20);
        t.push2(30);
        t.push2(40);
        System.out.println(t.pop1());
        System.out.println(t.pop2());
    }
}