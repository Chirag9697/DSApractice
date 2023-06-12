import java.lang.String;
import java.util.*;
public class Balancedparenthesis {
    public static void main(String []args){
        String str="(()))";
        int flag=1;
        int n=str.length();
        ArrayDeque<Character>a=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                a.push(str.charAt(i));
            }
            else{
                if(str.charAt(i)==')'){
                    if(a.size()!=0 && a.peek()=='('){
                        a.pop();
                    }
                    else{
                        System.out.print(false);
                        flag=0;
                        break;
                    }
                }
                else if(str.charAt(i)=='}'){
                     if(a.size()!=0 &&  a.peek()=='{'){
                        a.pop();
                    }
                    else{
                        System.out.print(false);
                        flag=0;
                        break;
                    }
                }
                else{
                    if(a.size()!=0 && a.peek()=='['){
                        a.pop();
                    }
                    else{
                        System.out.print(false);
                        flag=0;
                        break;
                    } 
                }
            }
        }
        if(a.size()==0 && flag==1){
            System.out.print(true);
        }
    }    
}
