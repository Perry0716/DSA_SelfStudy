package Practiles;

import java.util.Scanner;

public class z_09_PrintDigits {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;
        while (temp != 0){
            temp = temp/10;
            count++;
        }

        System.out.println("no of digits : "+ count);

        int divisor = 1;
        for (int i = 1; i<count; i++){
            divisor= divisor*10;
        }

        while (divisor != 0){
            System.out.println(num/divisor);
            num = num%divisor;
            divisor= divisor/10;
        }
    }
}
