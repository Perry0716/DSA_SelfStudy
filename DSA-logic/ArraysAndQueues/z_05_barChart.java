package ArraysAndLinkedLists;

import java.util.Scanner;

public class z_05_barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size :");
        int size = sc.nextInt();

        int[] a = new int[size];
        for (int i=0; i<size; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for (int i = 0; i < a.length; i++){
            if(a[i] >= max){
                max = a[i];
            }
        }

        for(int j= max; j>=1; j--){
//            System.out.println(j);
            for (int k=0; k<a.length; k++){
                if(a[k] >= j){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
