package Practiles;

import java.util.Scanner;

public class z_07_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter max number for fibonacci series : ");
        int n = sc.nextInt();
        int first = 0;
        int second =1;

        for (int i =0 ;i < n; i++){
            System.out.print(first + " ");
            int sum = first+second ;
            first = second ;
            second = sum;
        }

    }
}
