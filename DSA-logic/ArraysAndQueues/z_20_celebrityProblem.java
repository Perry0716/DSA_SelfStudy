package ArraysAndLinkedLists;

import java.util.Scanner;
import java.util.Stack;

public class z_20_celebrityProblem {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        int[][] array = new int[rows][columns];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int value = sc.nextInt();
                array[i][j] = value;
            }
            System.out.println("next row");
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        findCelebrity(array);
    }
    public static void findCelebrity(int[][] a){
        Stack<Integer> st = new Stack<>();
        for(int i =0; i< a.length;i++){
            st.push(i);
        }
        while (st.size() >= 2){
            int i = st.pop();
            int j = st.pop();
            if(a[i][j] == 1){
                st.push(j);
            }
            else {
                st.push(i);
            }
        }
        int pot = st.pop();
        for(int i=0; i<a.length;i++){
            if(i != pot){
                if(a[i][pot] ==0 || a[pot][i] == 1){
                    System.out.println("none");
                    return;
                }
            }
        }
        System.out.println(pot);
    }
}
