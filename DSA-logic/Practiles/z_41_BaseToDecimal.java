package Practiles;

import java.util.Scanner;

public class z_41_BaseToDecimal {
    public static int getValue(int num, int base){
        int sum = 0;
        int mul=1;
        while (num > 0){
            int digit = num%10;
            num = num/10;

            digit = digit * mul;
            sum = sum + digit;
            mul = mul *base;

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        System.out.println("Enter base");
        int b = sc.nextInt();

        int finalValue= getValue(n, b);
        System.out.println(finalValue);
    }
}
