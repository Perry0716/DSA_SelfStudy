package ArraysAndLinkedLists;

import java.sql.Array;

public class z_01_ArrayIntro {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 93;
        arr[2] = 33;
        arr[3] = 25;
        arr[4] = 43;

        System.out.println("Length is : "+arr.length);
        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
