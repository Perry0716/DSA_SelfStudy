package ArraysAndLinkedLists;

import java.util.Scanner;
import java.util.Stack;

public class z_15_slidingWindowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        int grt = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Given array is : " + arr[i]);
        }
        System.out.println("Enter window size : ");
        int k = sc.nextInt();
        solve15(arr, k);

    }
    public static void solve15(int[] a, int k){
        int[] nge = new int[a.length];
        int[] mG = new int[a.length];  //max grater array for every element in array a
        Stack<Integer> st = new Stack<>();
        st.push(a.length - 1);
        nge[a.length-1] = a.length;

        for(int i = a.length-2; i >= 0; i--){
            while (st.size() > 0 && a[i] >= a[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = a.length;
            }
            else {
                nge[i] = st.peek();
            }
        st.push(i);
        }
        int j = 0;
        for(int i = 0; i <= a.length - k; i++){
            if( j < i) {
                 j = i;
            }
            while (nge[j] <= i+k){
                j = nge[j];
            }
            System.out.println(a[j]);
        }

    }

}
