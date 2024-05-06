package ArraysAndLinkedLists;

import java.util.Scanner;
import java.util.Stack;

public class z_22_smallestNumFollowingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern of 'i' and 'd' : ");
        String string = sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        int num = 1;

        for (int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(ch == 'd'){
                stack.push(num);
                num++;
            }
            else if(ch == 'i'){
                stack.push(num);
                num++;
                while (stack.size() >0){
                    System.out.print(stack.pop());
                }
            }
        }
        stack.push(num);
        while (stack.size() >0){
            System.out.print(stack.pop());
        }

    }
}
