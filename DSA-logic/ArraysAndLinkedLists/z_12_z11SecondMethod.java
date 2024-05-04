package ArraysAndLinkedLists;

import java.util.Scanner;
import java.util.Stack;

public class z_12_z11SecondMethod {
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
        int[] sol = solution(arr);
        display(sol, arr);
    }

    public static int[] solution(int[] a) {
        int[] nge = new int[a.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 1; i < a.length; i++){
            while(st.size() > 0 && a[i] > a[st.peek()]){
                int pos = st.peek();
                nge[pos] = a[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() > 0){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }

    public static void display(int[] gval, int[] nums){
        for (int i = 0; i < gval.length; i++){
            System.out.println("For element " + nums[i] +" Gratesst element is "+gval[i]);
        }
    }
}
