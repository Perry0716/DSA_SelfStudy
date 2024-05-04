package Practiles;

import java.util.Scanner;

public class z_08_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number , i will count the digits from this number : ");
        int num = sc.nextInt();
        int count =0;

        while (num  != 0){
            num = num/10;
            count++;
        }

        System.out.println("Total number of digits are : " + count);
    }
}
