package Practiles;

import java.util.Scanner;

public class z_22_pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row(must be even) : ");
        int row = sc.nextInt();

        int sp = 1;
        int st = row/2 +1;

        for(int i=1; i<=row; i++){

            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }

            for (int j=1; j<=sp; j++){
                System.out.print("\t");
            }

            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }

            if(i <= row/2){
                st--;
                sp+=2;
            }
            else {
                st++;
                sp-=2;
            }
            System.out.println();
        }
    }
}
