package ArraysAndLinkedLists;

public class z_02_ArrayMemory {
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 93;
        arr[2] = 33;
        arr[3] = 25;
        arr[4] = 43;

        int[] arr2 = arr;
        arr2[1] = 20;
        System.out.println("Length is : " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("-----\n" +arr[i]);
        }
        
        swap(arr, 2,3);
        System.out.println("After swap");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
