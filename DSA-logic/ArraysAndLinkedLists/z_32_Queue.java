package ArraysAndLinkedLists;

import java.util.ArrayDeque;
import java.util.Queue;

public class z_32_Queue {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        que.add(10);
        System.out.println(que);
        que.add(20);
        System.out.println(que);
        que.add(30);
        System.out.println(que);

        System.out.println(que.remove());
        System.out.println(que);
        System.out.println(que.remove());
        System.out.println(que);
    }
}
