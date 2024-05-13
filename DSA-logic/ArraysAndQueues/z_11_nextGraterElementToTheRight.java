package ArraysAndLinkedLists;

import java.util.Scanner;
import java.util.Stack;

public class z_11_nextGraterElementToTheRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        Stack<Integer> st = new Stack<>();
        int grt = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Given array is : " + arr[i]);
        }

        int[] anss = solve(arr);
        display(anss, arr);
    }

    public static int[] solve(int[] a){

        int[] nge = new int[a.length];      //next grater element
        Stack<Integer> st = new Stack<>();
        st.push(a[a.length-1]);
        nge[a.length - 1] = -1;             //last element has no right side

        for(int i = a.length - 2; i >=0; i--){
            while (st.size() > 0 && a[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = -1;
            }
            else {
                nge[i] = st.peek();
            }
            st.push(a[i]);
        }
        return nge;
    }
    public static void display(int[] gval, int[] nums){
        for (int i = 0; i < gval.length; i++){
            System.out.println("For element " + nums[i] +" Gratesst element is "+gval[i]);
        }
    }

}
