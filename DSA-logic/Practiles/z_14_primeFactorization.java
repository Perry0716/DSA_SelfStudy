package Practiles;

import java.util.Scanner;

public class z_14_primeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for(int div=2 ; div < (int)Math.sqrt(num); div++){
            while(num % div == 0){
                System.out.println(div);
                num = num/ div;
            }
        }

        if(num != 1){
            System.out.println(num);
        }
    };
}
