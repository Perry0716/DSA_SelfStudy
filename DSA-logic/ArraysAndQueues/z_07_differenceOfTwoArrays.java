package ArraysAndLinkedLists;

import java.util.Scanner;

public class z_07_differenceOfTwoArrays {
    public static void subtraction(int[] a1, int[] a2){
        int[] sub = new int[a1.length];
        int ans = 0;
        int carry = 0;

        int i = a1.length -1;
        int j = a2.length -1;
        int k = sub.length -1;

        while (k >= 0){
            int d;
            int a2v = j        >= 0? a2[j] :0;
            if(a1[i]+carry >= a2v){
                carry = 0;
                d = a1[i] - a2v;
            }
            else {
                carry = -1;
                d = (a1[i] + carry +10)-a2[j];
            }

            sub[k] = d;
            i--;
            k--;
            j--;

        }
        int idx = 0;
        while (idx < sub.length){
            if(sub[idx] == 0){
                idx++;
            }
            else {
                break;
            }
        }
        while (idx < sub.length){
            System.out.println(sub[idx]);
            idx++;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size 1 : ");
        int s1 = sc.nextInt();
        int[] arr1 = new int[s1];
        for (int i=0; i<s1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size 2 : ");
        int s2 = sc.nextInt();
        int[] arr2 = new int[s2];
        for (int i=0; i<s2; i++){
            arr2[i] = sc.nextInt();
        }

        if(arr1.length >= arr2.length){
            subtraction(arr1, arr2);
        }
        else {
            subtraction(arr2, arr1);
        }

    }
}
