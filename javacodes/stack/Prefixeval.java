import java.util.ArrayDeque;

public class Prefixeval {
    static String reversing(String tmp){
        int n=tmp.length();
        String res="";
        for(int i=n-1;i>=0;i--){
            res+=tmp.charAt(i);
        }
        return res;
    }
    public static void main(String []args){
         String s="+ * 10 2 3";
        ArrayDeque<String>st=new ArrayDeque<String>();
        // int val=-1;
        String tmp="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && tmp.length()!=0){
                tmp=reversing(tmp);
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
                    // System.out.print("hell");
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
