package ArraysAndLinkedLists;

import java.util.Scanner;
import java.util.Stack;

public class z_10_balancdBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expressions :");
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            if(ch == ')' ){
                boolean val = handlingCode(st, '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            if(ch == '}' ){
                boolean val =handlingCode(st, '{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            if(ch == ']' ) {
                boolean val = handlingCode(st, '[');
                if (val == false) {
                    System.out.println(val);
                    return;
                }
            }
        }
        if(st.size() ==0){
            System.out.println("succes");
        }
        else {
            System.out.println(false);
        }
    }

    public static boolean handlingCode(Stack<Character> st, char chopen){
        if(st.size() == 0){
            return false;
        }
        else if (st.peek() != chopen) {
            return false;
        }
        else {
            st.pop();
            return true;
        }
    }
}
