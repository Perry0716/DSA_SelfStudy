package ArraysAndLinkedLists;

import java.util.Scanner;
import java.util.Stack;

public class z_14_largestAreaOfHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Given array is : " + arr[i]);
        }
        int[] sol = solution13(arr);
        display(sol, arr);
    }

    //Method solution

    public static int[] solution13(int[] a) {
        int[] right = new int[a.length];         //next smaller index on right
        Stack<Integer> st = new Stack<>();
        st.push(a.length -1);
        right[a.length-1] = a.length;

        for(int i = a.length -2; i >= 0; i-- ){
            while (st.size() >0 && a[i] <= a[ st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                right[i] = a.length;
            }
            else {
                right[i] = st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < right.length; i++) {
            System.out.println("Given right array is : " + right[i]);
        }



        int[] left = new int[a.length];         //next grater element on left
        st = new Stack<>();
        st.push(0);
        left[0] = -1 ;

        for(int i = 1; i < a.length; i++ ){
            while (st.size() >0 && a[i] <= a[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                left[i] = -1;
            }
            else {
                left[i] = st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < left.length; i++) {
            System.out.println("Given left array is : " + left[i]);
        }


        int[] area = new int[a.length];             //area of the largest rectangle

        for (int i = 0; i < a.length; i++){
            int width = right[i] - left[i] -1;
            area[i] = a[i] * width;
        }
        for (int i = 0; i < area.length; i++) {
            System.out.println("Given array is : " + area[i]);
        }
        return area;

    }
    public static void display(int[] gval, int[] nums){
        for (int i = 0; i < gval.length; i++){
            System.out.println("For element " + nums[i] +" largest area is "+gval[i]);
        }
        int maxArea = gval[0];
        for (int i = 1; i<nums.length; i++){
            if(gval[i] >= maxArea){
                maxArea =gval[i];
            }
        }
        System.out.println( "Max area is : "+maxArea);

    }
}
