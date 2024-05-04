package Practiles;

import java.util.Scanner;

public class z_39_numSystem {
    public static int getValueInAnyBase(int num, int base) {
        int sum = 0;
        int p = 1;
        while (num > 0){
            int digit = num % base;
            num = num/base;

            sum = sum + digit*p;
            p=p*10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in binary");
        int n = sc.nextInt();
        System.out.println("Enter base");
        int b = sc.nextInt();
        int value = getValueInAnyBase(n, b);
        System.out.println(value);
    }
}
