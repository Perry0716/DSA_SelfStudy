package Practiles;

import java.util.Scanner;

public class z_31_pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int sp = n/2;
        int st = 1;
        int temp = 1;
        int temp2;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" \t");
            }

            temp2 = temp;
            for(int j=1; j<=st; j++){
                System.out.print(temp2+"\t");
                if(j <= n/2){
                    temp2++;
                }
                else {
                    temp2--;
                }

            }

            if(i <= n/2){
                sp--;
                st+=2;
                temp++;
            }
            else {
                sp++;
                st-=2;
                temp--;
            }
            System.out.println();
        }
    }
}
