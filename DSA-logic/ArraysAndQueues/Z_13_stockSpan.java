package ArraysAndLinkedLists;

import java.util.Scanner;
import java.util.Stack;

public class Z_13_stockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Given array is : " + arr[i]);
        }
        int[] sol = solution13(arr);
        display(sol, arr);
    }
    public static int[] solution13(int[] a) {
        int[] nge = new int[a.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        nge[0] =1;

        for (int i = 1; i < a.length; i++){
            while(st.size() > 0 && a[i] > a[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = i+1;
            }
            else {
                nge[i] = i - st.peek();
            }
            st.push(i);
        }

        return nge;
    }
    public static void display(int[] gval, int[] nums){
        for (int i = 0; i < gval.length; i++){
            System.out.println("For element " + nums[i] +" Span is "+gval[i]);
        }
    }
}
