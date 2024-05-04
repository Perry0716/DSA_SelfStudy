package Practiles;

import java.util.Scanner;

public class z_24_pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j=n; j>=1; j--){
                if(i == j){
                    System.out.print("*\t");
                }
                else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
