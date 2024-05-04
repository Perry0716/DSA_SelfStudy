package Practiles;

import java.util.Scanner;

public class z_45_anyBaseMul {

    public static int mul(int base, int n1, int n2){
        int ans = 0;

        int p = 1;
        while (n2 > 0){
            int d2 = n2 % 10;
            n2 = n2/10;

            int sprd = getProductWithASingleDigit(base, n1, d2);
            ans = getSum(base, ans, sprd * p);
            p = p * 10;
        }
        return ans;
    }

    public static int getProductWithASingleDigit(int b, int n1, int d2){
        int tempAns = 0;

        int carry = 0;
        int p = 1;
        while (n1 > 0 || carry > 0){
            int d1 = n1 % 10;
            n1 = n1 / 10;

            int d = d1 * d2 + carry;

            carry = d / b;
            d = d % b;

            tempAns = tempAns + (d * p);
            p = p * 10;
        }
        return tempAns;
    }

    public static int getSum(int b, int n1, int n2) {
        int sum = 0;
        int carry = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;

            int digit = digit1 + digit2 + carry;
            carry = digit / b;
            digit = digit % b;

            n1 = n1 / 10;
            n2 = n2 / 10;

            sum = sum + digit * p;
            p = p * 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base");
        int base = sc.nextInt();
        System.out.println("enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        int multiplication = mul(base, num1, num2);
        System.out.println("multiplication is :" + multiplication);
    }
}
