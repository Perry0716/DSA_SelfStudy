package ArraysAndLinkedLists;

import java.util.Scanner;
import java.util.Stack;

class main4{
    public static class CustomStack {
        Stack<Integer> allData;
        int min;
        int tos;

        public CustomStack() {
            allData = new Stack<>();
        }

        int size() {
            return allData.size();
        }

        void push(int val) {
            if (allData.size() == 0) {
                allData.push(val);
                min = val;
            }
            else if(val >= min){
                allData.push(val);
            }
            else {
                allData.push(val + val - min);     // Detation storing fake smaller value
                min = val;                              //Original value stored in min
            }
        }
        int pop() {
            if (allData.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            else {
                if(allData.peek() > min){
                    return allData.pop();
                }
                else {
                    int ov = min;
                    min = 2 * min - allData.pop();
                    return ov;
                }
            }
        }

        int top() {
            if (allData.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            else {
                if(allData.peek() > min){
                    return allData.peek();
                }
                else {
                    return min;
                }
            }
        }

        int min() {
            if (allData.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                return min;
            }
        }
    }
}

public class z_31_stackMinWithSingleStackOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack :");
        int n = sc.nextInt();
        String str = sc.nextLine();
        CustomStack st = new CustomStack(n);


        while (str.equals("quit") == false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            }
            else if(str.startsWith("pop")){
                int val= st.pop();
                if(val != -1){
                    System.out.println(val);
                }
            }
            else if(str.startsWith("top")){
                int val = st.pop();
                if(val != -1){
                    System.out.println(val);
                }
            }
            else if(str.startsWith("size")){
                System.out.println(st.size());
            }

            str = sc.nextLine();
        }

    }
}
