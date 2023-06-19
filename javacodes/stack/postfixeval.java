import java.util.*;
import java.lang.*;
public class postfixeval {
   public static void main(String []args){
        String s="10 2 + 3 *";
        ArrayDeque<String>st=new ArrayDeque<String>();
        // int val=-1;
        String tmp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && tmp.length()!=0){
                st.push(tmp);
                tmp="";
            }
            else if(Character.isDigit(s.charAt(i))){
                // System.out.println("operand");
                tmp+=s.charAt(i);
            }
            else if(s.charAt(i)!=' ' && Character.isDigit(s.charAt(i))==false){
                int val=0;
                // System.out.println(st.pop());
                if(s.charAt(i)=='+'){
                    val=Integer.parseInt(st.pop())+Integer.parseInt(st.pop());
                }
                else if(s.charAt(i)=='-'){
                    val=Integer.parseInt(st.pop())-Integer.parseInt(st.pop());
                }
                else if(s.charAt(i)=='*'){
                    val=Integer.parseInt(st.pop())*Integer.parseInt(st.pop());
        
                }
                else if(s.charAt(i)=='/'){
                    val=Integer.parseInt(st.pop())/Integer.parseInt(st.pop());
                }
                // System.out.println(val);
                st.push(String.valueOf(val));
            }
        }
        System.out.println(st.pop());
      } 
}
