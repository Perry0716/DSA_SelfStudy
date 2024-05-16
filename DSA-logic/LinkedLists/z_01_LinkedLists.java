import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class z_01_LinkedLists {
    public static class Node{
        int data;
        Node next;

    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        void addLast(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0){
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public void addListFirst(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
            if(size == 0){
                tail = temp;

            }
            size++;
        }

        public void addAtIndex(int idx, int val){
            if(idx < 0 || idx > size){
                System.out.println("Invalid");
            }
            else if(idx == 0) {
                addListFirst(val);
            }
            else if(idx == size){
                addLast(val);
            }
            else {
                Node node = new Node();
                node.data = val;

                Node temp = head;
            for(int i = 0; i <idx; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
            }
        }

        int removeFirst(){
            if(size == 0){
                System.out.println("List is Empty");
                return -1;
            }
            else{
                Node temp = head;
                if(temp.next == null){
                    int val = head.data;
                    head = tail = null;
                    size = 0;
                    return val;
                }
                else{
                    int val = head.data;
                    head = head.next;
                    size--;
                    return val;
                }
            }
        }

        int removeLast() {
            if (size == 0 || size < 0) {
                System.out.println("Invalid");
                return -1;
            } else if (size == 1) {
                int val = tail.data;
                head = tail = null;
                size = 0;
                return val;
            } else {
                int val = tail.data;
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;
                return val;
            }
        }

        int removeAt(int idx){
            if (idx > size || idx < 0) {
                System.out.println("Invalid");
                return -1;
            }
            else if (idx == 0) {
                int val = removeFirst();
                return val;
            }
            else if(idx == size){
                int val =removeLast();
                return val;
            }
            else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                int val = temp.next.data;
                size--;
                return val;
            }
        }

        public int getFirst(){
            if(size == 0){
                return -1;
            }
            else {
                return head.data;
            }
        }
        public int getLast(){
            if(size == 0){
                return -1;
            }
            else {
                return tail.data;
            }
        }
        public int getIndex(int idx){
            Node temp = head;
            if(idx > size){
                System.out.println("invalid index");
                return -1;
            }
            else if(size == 0){
                return -1;
            }
            else {
                for (int i=0; i<idx; i++){
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        int size(){
            return size;
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void reverseWRTData(){          //uses getNode private method for getting a node
            int li = 0;
            int rt = size - 1;
            while (li < rt){
               Node left = getNode(li);
               Node right = getNode(rt);

               int temp = left.data;
               left.data = right.data;
               right.data = temp;

               li++;
               rt--;

            }
        }

        private Node getNode(int idx){
            Node temp = head;
                for (int i=0; i<idx; i++) {
                    temp = temp.next;
                }
                return temp;
        }

        void reverseWrtPointer(){
            Node previous = null;
            Node current = head;

            while (current != null){
                Node originalCurr = current.next;
                current.next = previous;

                previous = current;
                current = originalCurr;
            }

            Node temp = head;
            head = tail;
            tail = temp;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while (str.equals("quit") == false){
            if(str.startsWith("addList")){
                list.addLast(Integer.parseInt(str.split(" ")[1]));
            }
            else if(str.startsWith("addListFirst")){
                list.addListFirst(Integer.parseInt(str.split(" ")[1]));
            }
            else if(str.startsWith("addListFirst")){
                list.addListFirst(Integer.parseInt(str.split(" ")[1]));
            }
            else if(str.startsWith("addAtIndex")){
                list.addAtIndex(Integer.parseInt(str.split(" ")[1]), Integer.parseInt(str.split(" ")[2]));
            }
            else if(str.startsWith("removeFirst")){
                int val = list.removeFirst();
                if(val != -1){
                    System.out.println(val);
                }
            }
            else if(str.startsWith("removeLast")){
                int val = list.removeLast();
                if(val != -1){
                    System.out.println(val);
                }
            }
            else if(str.startsWith("removeAt")){
                int val = list.removeAt(Integer.parseInt(str.split(" ")[1]));
                if(val != -1){
                    System.out.println(val);
                }
            }
            else if(str.startsWith("getFirst")){
                int val = list.getFirst();
                if(val != -1){
                    System.out.println(val);
                }
            }else if(str.startsWith("getLast")){
                int val = list.getLast();
                if(val != -1){
                    System.out.println(val);
                }
            }else if(str.startsWith("getIndex")){
                int val = list.getIndex(Integer.parseInt(str.split(" ")[1]));
                if(val != -1){
                    System.out.println(val);
                }
            }
            else if(str.startsWith("display")){
                list.display();
            }
            else if(str.startsWith("size")){
                System.out.println(list.size());
            }
            else if(str.startsWith("reverseLLData")){
                list.reverseWRTData();
            }
            else if(str.startsWith("reverseLLpointer")){
                list.reverseWrtPointer();
            }

        }

    }
}
