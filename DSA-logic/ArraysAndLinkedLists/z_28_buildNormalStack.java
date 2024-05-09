package ArraysAndLinkedLists;

import java.util.Scanner;


    class CustomStack{
        int[] data;
        int tos;
        public CustomStack(int cap){
          data = new int[cap];
          tos = -1;
        }
        int size(){
            return tos+1;
        }
        void display(){
            for(int i =tos; i>=0; i--){
                System.out.println("Index : " + i + ", Value : "+ data[i]);
            }
        }
        void push(int val){
            if(tos == data.length){
                System.out.println("Stack Overflow");
            }
            else {
                tos++;
                data[tos] = val;
            }
        }
        int pop(){
            if(tos == -1){
                System.out.println("Stack underflow");
                return -1;

            }
            else {
                int val = data[tos];
                tos = tos-1;
                return val;
            }
        }
        int top(){
            if(tos == -1){
                System.out.println("Stack underflow");
                return -1;
            }
            else {
                return data[tos];
            }
        }
    }


public class z_28_buildNormalStack {
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
            else if(str.startsWith("display")){
                st.display();
            }
            str = sc.nextLine();
        }

    }
}
