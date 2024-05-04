package ArraysAndLinkedLists;

import java.util.Scanner;

public class z_06_sumOfTwoArrays {

    public static void addition(int[] a1, int[] a2){
    int[] add = new int[a1.length];
    int carry = 0;
    int i = a1.length-1;
    int j = a2.length-1;
    int k = add.length-1;

    while (k >= 0){
        int digit = carry;

        if(i >= 0){
            digit += a1[i];
        }
        if(j >= 0){
            digit += a2[j];
        }

        carry = digit / 10;
        digit = digit % 10;

        add[k] = digit;

        i--;
        j--;
        k--;

    }
        for (int value :
                add) {
            System.out.println(value);
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
            addition(arr1, arr2);
        }
        else {
            addition(arr2, arr1);
        }

    }
}
