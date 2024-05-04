package Practiles;

import java.util.Scanner;

public class z_06_PrimeWithRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the range ");
        System.out.print("Enter lower bound : ");
        int low = sc.nextInt();
        System.out.print("Enter higher bound : ");
        int high = sc.nextInt();

        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i + " Is Prime");
            }
            else {
                System.out.println(i + " Is Not Prime");
            }
        }
    }
}
