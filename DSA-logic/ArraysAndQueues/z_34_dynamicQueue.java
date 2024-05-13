package ArraysAndLinkedLists;

import java.util.Scanner;

class DynQueue{
    int[] data;
    int front;
    int size;
    DynQueue(int size){
        data = new int[size];
        front = 0;
        size = 0;
    }
    public int peek(){
        if(size == 0){
            System.out.println("Queue underflow");
            return -1;
        }
        else {
            return data[front];
        }

    }
    public void add(int val){
        if(size == data.length){
            int[] ndata = new int[2*data.length];

            for(int i =0; i<size; i++){
                int idx = (front +i) % data.length ;
                ndata[i] = data[i];
            }
            ndata = data;
            front = 0;

            int idx = (front + size) % data.length;
            data[idx] = val;
            size++;
        }
        else {
            int rear = (front + size) % data.length;
            data[rear] = val;
            size++;
        }
    }
    public void display(){
        for (int i = 0; i < size; i++){
            int idx = (front +i) % data.length ;
            System.out.print(data[idx]);
        }
        System.out.println();
    }
    public int size(){
        int val =0;
        return val;
    }
    public int remove(){
        int val =0;
        return val;
    }
}

public class z_34_dynamicQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size  = sc.nextInt();
        DynQueue dq = new DynQueue(size);

        String str = sc.nextLine();
        while (str.equals("quit") == false){
            if(str.startsWith("add")){
                dq.add(Integer.parseInt(str.split("")[1]));
            }
            else if(str.startsWith("remove")){
                int val = dq.remove();
                if(val != -1){
                    System.out.println(val);
                }
            }
            else if(str.startsWith("display")){
                dq.display();
            }
            else if(str.startsWith("size")){
                dq.size();
            }
            else if(str.startsWith("top")){
                int val = dq.peek();
                if(val != -1){
                    System.out.println(val);
                }
            }
        }
    }
}
