package ArraysAndLinkedLists;

import java.util.Scanner;

public class z_04_findElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i< size; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("enter value that you want to find : ");
        int n = sc.nextInt();

        int index = -1;
        for(int i = 0; i < a.length; i++){
            if(a[i] == n){
                index = i;
            }
        }
        System.out.println("number "+n+" found at index "+index);
    }
}
