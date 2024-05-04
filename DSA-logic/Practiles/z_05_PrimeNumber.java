package Practiles;

import java.util.Scanner;

public class z_05_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total numbers that you want to test :");
        int t = sc.nextInt();
        System.out.println("Enter your numbers : ");

        //checking all numbers
        for (int i = 0; i<t ; i++){
            int n = sc.nextInt();

            //Prime or not prime
            int count =0;
            for (int j=2; j<=Math.sqrt(n); j++)
                if (n % j == 0) {
                    count++;
                    break;
                }

            if(count == 0){
                System.out.println("Prime");
            }
            else {
                System.out.println("Not Prime");
            }
        }
    }
}
