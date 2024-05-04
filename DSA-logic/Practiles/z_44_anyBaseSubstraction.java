package Practiles;

import java.util.Scanner;

public class z_44_anyBaseSubstraction {

    public static int subtraction(int base, int num1, int num2){
        int sub = 0;
        int carry =0;
        int p =1;
        while (num2 > 0){
            int digit1 = num1%10;
            num1=num1/10;
            int digit2 = num2%10;
            num2=num2/10;

            int d =0;
            digit2 = digit2 + carry;

            if(digit2 >= digit1){
                carry = 0;
                d = digit2 - digit1;
            }
            else {
                carry = -1;
                d = (digit2+ base) - digit1;
            }
            sub = sub + (d * p );
            p = p*10;
        }
        return sub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base for both numbers");
        int b = sc.nextInt();
        System.out.println("enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();

        System.out.println("subtraction is : "+ subtraction(b, n1, n2));

    }
}
