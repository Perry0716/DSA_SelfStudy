package Practiles;

import java.util.Scanner;

public class Z_37_factorial {
    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println("factorial is : "+ factorial);
    }
}
