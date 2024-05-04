package ArraysAndLinkedLists;

import java.util.Scanner;

public class z_03_spanOfArray  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i< size; i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int value:a) {
            if(value >= max){
                max = value;
            }
            if(value <= min){
                min = value;
            }
        }
        int span = max - min;
        System.out.println("Span is : "+span);
    }
}
