package ArraysAndLinkedLists;

public class z_23_OOPs {
    public static class Student{
        int roll_no;
        String name;
        void sayHi(){
            System.out.println(name+"Says hi "+"and age is "+ roll_no);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll_no = 1;
        s1.name = "Priya";
        s1.sayHi();

        Student s2 = new Student();
        s2.roll_no = 2;
        s2.name = "Shivani";
        s2.sayHi();

        Student s3 = s1;
        s3.name = "Satyam";
        s3.sayHi();
        s1.sayHi();
    }
}
