package Practiles;

import java.util.Scanner;

public class z_38_digitFrequency {
    public static int countDigit(int n, int d){
        int count =0;
        while (n !=0){
            int n2 = n%10;
            if(n2 == d){
                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();

        System.out.println("digit "+ digit+" is repeated in number "+num+", " +countDigit(num, digit)+" times !");
    }
}
