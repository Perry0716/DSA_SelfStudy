package ArraysAndLinkedLists;

import java.util.Scanner;
import java.util.Stack;

public class z_19_prefixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter postfix Expression :");
        String exp = sc.nextLine();
        Stack<Integer> vs = new Stack<>(); //For calculating value
        Stack<String> is = new Stack<>(); //for converting to infix expression
        Stack<String> ps = new Stack<>(); //for convertion to prefix expression

        for(int i=exp.length()-1; i>=0; i--){
            char ch = exp.charAt(i);

            //if character is number then push it into all stacks

            if(ch == '+' ||ch == '*'||ch == '/'||ch == '-'){
                //value stack
                int avs = vs.pop();
                int bvs = vs.pop();
                int sol = operation(avs, bvs, ch);
                vs.push(sol);
                //infix stack
                String ais = is.pop();
                String bis = is.pop();
                String sol2 = "(" + ais + ch + bis + ")";
                is.push(sol2);
                //prefix stack
                String aps = ps.pop();
                String bps = ps.pop();
                String sol3 = aps + bps +ch  ;
                ps.push(sol3);
            }
            else {
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
        }
        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }

    public static int operation(int v1, int v2, char optor) {
        if(optor == '+'){
            return v1+v2;
        }
        else if(optor == '-'){
            return v1-v2;
        }
        else if(optor == '*'){
            return v1 * v2;
        }
        else{
            return v1/v2;
        }
    }
}
