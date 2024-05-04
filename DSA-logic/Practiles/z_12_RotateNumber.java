package Practiles;

import java.util.Scanner;

public class z_12_RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Enter rotator constant k : ");
        int k = sc.nextInt();

        int count = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        System.out.println(count);

        //when k is grater the original length of number
        k = k % count;

        //when k is negetive convert it into positive
        if(k < 0){
            k = k+ count;
        }

        //when k is positive
        int div  =1;
        int mul = 1;
        for(int i = 1; i <= count; i++){
            if(i <= k){
                div = div * 10;
            }
            else {
                mul = mul * 10;
            }
        }

        int q = n / div;
        int rem = n % div;
        int num = (rem * mul ) + q;
        System.out.println(num);

    }
}
