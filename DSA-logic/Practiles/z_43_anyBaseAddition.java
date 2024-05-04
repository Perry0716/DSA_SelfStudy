package Practiles;

import java.util.Scanner;

public class z_43_anyBaseAddition {

    public static int addition(int base, int num1, int num2){
        int sum = 0;
        int carry =0;
        int p =1;
        while (num1 >0 || num2 > 0 || carry>0){
            int digit1 = num1%10;
            int digit2 = num2%10;

            int digit = digit1 + digit2 + carry;
            carry = digit / base;
            digit = digit % base;

            num1=num1/10;
            num2=num2/10;

            sum = sum + digit * p;
            p = p*10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base for both numbers");
        int b = sc.nextInt();
        System.out.println("enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();

        System.out.println("addition is : "+ addition(b, n1, n2));

    }
}
