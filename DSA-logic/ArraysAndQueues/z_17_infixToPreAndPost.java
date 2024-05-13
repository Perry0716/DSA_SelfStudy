package ArraysAndLinkedLists;

import java.util.Scanner;
import java.util.Stack;

public class z_17_infixToPreAndPost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Given Expression : " + s);

        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                optors.push(ch);
            }
            else if(( ch >= '0' && ch <= '9') ||(ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z')){
                pre.push(ch + "");    //char to integer
                post.push(ch + "");    //char to integer
            }
            else if(ch == ')'){
                while (optors.peek() != '('){
                    char optor = optors.pop();
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + optor;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = optor + prev1 + prev2;
                    pre.push(prev);
                }
                optors.pop();
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
                while (optors.size() > 0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())){
                    char optor = optors.pop();
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + optor;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = optor + prev1 + prev2;
                    pre.push(prev);
                }
                optors.push(ch);  //pushing itself
            }
        }
        while (optors.size() != 0) {
            char optor = optors.pop();
            String postv2 = post.pop();
            String postv1 = post.pop();
            String postv = postv1 + postv2 + optor;
            post.push(postv);

            String prev2 = pre.pop();
            String prev1 = pre.pop();
            String prev = optor + prev1 + prev2;
            pre.push(prev);
        }

        System.out.println("Prefix is : "+pre.peek());
        System.out.println("Postfix is : "+post.peek());
        }


    public static int precedence(char optor){
        if(optor == '+' || optor == '-'){
            return 1;
        }

        else if(optor == '*' || optor == '/'){
            return 2;
        }
        else{
            return 0;
        }
    }



}
