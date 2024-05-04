package Practiles;

import java.util.Scanner;

public class z_11_inverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter valid input only please check constraints before entering input : ");
        int num = sc.nextInt();

        //op=original place, od= original digit, invp= inverted place , invn = inverted num
        int op = 1;
        int inv = 0;

        while (num != 0){
            int od = num % 10;
            int id = op;              //inverted digit = original place
            int ip = od;              //inverted place = oiginal digit

            inv= inv + (id * (int)Math.pow(10, ip-1));

            num = num/10;
            op++ ;
        }
        System.out.println(inv);
    }
}
