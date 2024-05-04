package Practiles;

import java.util.Scanner;

public class z_27_pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int x = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print( x+"\t");
                x++;
            }
            System.out.println();
        }

    }
    }
