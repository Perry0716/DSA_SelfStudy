package Practiles;

import java.util.Scanner;

public class z_34_pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int sp = 0;
        int st = n;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=sp; j++){
                System.out.print(" \t");
            }
            for(int j=1; j<=st; j++){
                if(i >1 && i <= n/2 && j>1 && j<st){
                    System.out.print(" \t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            if(i <= n/2 ){
                st-=2;
                sp+=1;
            }
            else {
                st+=2;
                sp-=1;
            }
            System.out.println();
        }

    }
}
