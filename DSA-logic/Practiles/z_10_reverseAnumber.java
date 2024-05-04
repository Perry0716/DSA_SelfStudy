package Practiles;

import java.util.Scanner;

public class z_10_reverseAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and i will return reverse number");
        int num = sc.nextInt();

        int count =0;
        int temp =num;
        while (temp!=0){
            temp = temp/10;
            count++;
        }

        //Reverse a number
        int divisor =10;

        while (num != 0){
            System.out.println(num%divisor);
            num = num/divisor;

        }

    }
}
