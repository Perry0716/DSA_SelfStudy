package Practiles;

import java.util.Scanner;

public class z_20_pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int st = n;
        int sp = 1;
        for(int i =1; i<=n; i++){
            for(int j=1; j<sp; j++){
                System.out.print(" \t");
            }
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }

            st--;
            sp++;
            System.out.println();
        }
    }
}
