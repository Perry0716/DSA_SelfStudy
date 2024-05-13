package ArraysAndLinkedLists;
import java.util.Scanner;

class CustomQueue{
    int[] data;
    int front;
    int size;
    public CustomQueue(int n){
        data = new int[n];
        front = 0;
        size = 0;
    }
    int size(){
        return data.length;
    }
    void display(){
        for (int i = 0; i < size; i++){
            int idx = (front +i) % data.length ;
            System.out.print(data[idx]);
        }
        System.out.println();
    }
    void add(int val){
        if(size == data.length){
            System.out.println("queue overflow");
        }
        else {
            int rear = (front + size) % data.length;  // Wrap the extra size suppose length = 3 and
                                                        // rear = 4 then 4%3 =1 ,value will be stored at 1st place
                data[rear] = val;
                size = size + 1;
        }
    }
    int remove(){
        if(size ==0){
            System.out.println("queue underflow");
            return -1;
        }
        else {
            int val = data[front];
            front = (front+1)% data.length;
            size = size -1;
            return val;
        }
    }
    int peek(){
        if(size == 0){
            System.out.println("queue overflow");
            return -1;
        }
        else {
            return data[front];
        }
    }
}
public class z_33_buildNormalQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n = sc.nextInt();
        CustomQueue que = new CustomQueue(n);

        String str = sc.nextLine();
        while (str.equals("quit") == false){
            if(str.startsWith("add")){
                int val = Integer.parseInt(str.split("")[1]);
                que.add(val);

            }
            else if(str.startsWith("remove")){
                int val = que.remove();
                if(val != -1){
                    System.out.println(val);
                }
            }
            else if(str.startsWith("size")){
                System.out.println(que.size());

            }
            else if(str.startsWith("display")){
                que.display();

            }
            else if(str.startsWith("peek")){
                int val = que.peek();
                if(val != -1){
                    System.out.println(val);
                }
            }
        }
    }
}
