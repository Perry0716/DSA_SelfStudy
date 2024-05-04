package Practiles;

import java.util.Scanner;

public class z_13_GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int original1 = num1;
        int original2 = num2;

        //GCD

        while (num1%num2 !=0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int GCD = num2;
        System.out.println("Gcd is : "+ GCD);

        int LCM = (original1 * original2) / GCD ;
        System.out.println("LCm is : "+ LCM);


    }
}
