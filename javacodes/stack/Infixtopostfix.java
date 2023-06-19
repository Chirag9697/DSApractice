import java.util.*;
import java.lang.*;

public class Infixtopostfix{
    static int precedence(char c){
        if(c=='+' || c=='-'){
            return 1;
        }
        else if(c=='*' || c=='/'){
            return 2;
        }
        else if(c=='('){
            return -1;
        }
        return 3;
    }
    public static void main(String []args){
        String infix="a+b*(c^d-e)^(f+g*h)-i";
        int n=infix.length();
        ArrayDeque<Character>st=new ArrayDeque<Character>();
        String res="";
        for(int i=0;i<n;i++){
            if(infix.charAt(i)=='('){
                st.push(infix.charAt(i));
            }
            else if(infix.charAt(i)>='a' && infix.charAt(i)<='z'){
                res+=infix.charAt(i);
            }
            else if(infix.charAt(i)==')'){
                // System.out.print("he");
                while(st.isEmpty()==false && st.peek()!='('){
                    res+=st.pop();
                }
                st.pop();
            }
            else{
                while(st.isEmpty()==false && precedence(st.peek())>=precedence(infix.charAt(i))){
                        res+=st.pop();
                }       
                // continue;
                // st.push(infix.charAt(i));
                st.push(infix.charAt(i));
            }
              
        }
        
        while(st.isEmpty()==false){
            res+=st.pop();
        }
        System.out.print(res);
    }   
}
