package ArraysAndLinkedLists;


import java.util.Scanner;
import java.util.Stack;

class main3 {
    public static class CustomStack {
        Stack<Integer> allData;
        Stack<Integer> minData;

        public CustomStack() {
            allData = new Stack<>();
            minData = new Stack<>();
        }

        int size() {
            return allData.size();
        }



        void push(int val) {
        allData.push(val);
        if(minData.size() == 0 || val <= minData.peek()){
            minData.push(val);
        }
        }


        int pop() {
            if (allData.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            else {
                int val = allData.pop();
                if(val == minData.peek()){
                    minData.pop();
                }
                return val;

            }
        }

        int top() {
            if (minData.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                return allData.peek();
            }
        }

        int min(){
            if(minData.size()==0){
                System.out.println("Stack underflow");
                return -1;
            }
            else {
                return minData.peek();
            }
        }
    }
}

public class z_30_stackMinimum {
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
