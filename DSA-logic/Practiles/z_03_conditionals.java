package Practiles;

import java.util.Scanner;

class Results{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();

        if (marks>=90){
            System.out.println("excellent");
        }
        else if (marks>=80 && marks<90) {
            System.out.println("good");

        }
        else if (marks>=70 && marks<80) {
            System.out.println("Fair");

        }
        else if (marks>=60 && marks<70) {
            System.out.println("Meets expectations");

        }
        else {
            System.out.println("below par");
        }
    }
}
public class z_03_conditionals {
    public static void main(String[] args) {
        int x1 = 11;
        int x2 = 31;

        //Even odd
        if(x1 % 2 ==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        System.out.println("after conditional");

        //comparison
        if(x1 == x2){
            System.out.println("both are equal");
        }
        else if(x1 != x2) {
            if (x1<x2){
                System.out.println("x1 less than x2");
            }
            else {
                System.out.println("x1 grater than x2");
            }
        }
        else {
            System.out.println("enter valid input");
        }
    }
}
