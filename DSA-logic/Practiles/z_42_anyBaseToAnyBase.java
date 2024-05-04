package Practiles;

import java.util.Scanner;

public class z_42_anyBaseToAnyBase {

    public static int getAnyBaseValue(int num, int base1, int base2) {
        int sum =0;
        int p =1;

        while (num > 0){
            int digit = num % base2;
            num = num/base2;

            sum = sum + digit * p;
            p = p * base1;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int n = sc.nextInt();
        System.out.println("enter current base");
        int b1 = sc.nextInt();
        System.out.println("enter expecting base");
        int b2 = sc.nextInt();

        int value = getAnyBaseValue(n, b1, b2);
        System.out.println(value);
    }
}
