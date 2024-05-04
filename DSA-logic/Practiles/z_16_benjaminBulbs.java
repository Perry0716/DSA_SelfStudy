package Practiles;

import java.util.Scanner;

public class z_16_benjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1 ; i<= (int)Math.sqrt(n); i++){
            System.out.println(i * i);  
        }
    }
}
