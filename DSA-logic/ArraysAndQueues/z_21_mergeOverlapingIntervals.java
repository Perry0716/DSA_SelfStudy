package ArraysAndLinkedLists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class z_21_mergeOverlapingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = sc.nextInt();
        int col = 2;
        int[][] array = new int[rows][col];

        for(int i=0; i<array.length; i++){
            for (int j =0; j<col; j++){
                System.out.println("enter interval for:"+i);
                int val = sc.nextInt();
                array[i][j] = val;
            }
            System.out.println("next row");
        }

        for (int i = 0; i<array.length; i++){
            for(int j=0; j<col; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        mergeInterval(array);
    }
    public static void mergeInterval(int[][] a){
    Pair[] pair = new Pair[a.length];
    for(int i =0; i<a.length; i++){
        pair[i] = new Pair(a[i][0], a[i][1]);
    }
    Arrays.sort(pair);
        Stack<Pair> st = new Stack<>();
        for (int i=0; i< pair.length;i++){
            if(i == 0){
                st.push(pair[i]);
            }
            else {
                Pair top = st.peek();
                if(pair[i].st > top.et){
                    st.push(pair[i]);
                }
                else {
                    top.et =Math.max(top.et, pair[i].et);
                }
            }
        }
        Stack<Pair> rs = new Stack<>();
        while (st.size()>0){
            rs.push(st.pop());
        }
        while (rs.size() > 0){
            Pair p = rs.pop();
            System.out.println(p.st + " " + p.et);
        }

    }
}
class Pair implements Comparable <Pair> {
    int st;
    int et;
    Pair(int st, int et){
        this.st = st;
        this.et = et;
    }
    public int compareTo(Pair other){
        if(this.st != other.st){
            return this.st - other.st;
        }
        else{
            return this.et- other.et;
        }
    }
}
