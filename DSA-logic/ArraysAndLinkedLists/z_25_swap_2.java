package ArraysAndLinkedLists;

public class z_25_swap_2 {
    public static class Person{
        int age;
        String name;
        void sayHi(){
            System.out.println("Name is : "+name+", Age is : "+ age);
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Satyam";
        p1.age = 18;

        Person p2 = new Person();
        p2.name = "Shivani";
        p2.age = 25;

        p1.sayHi();
        p2.sayHi();
        swap2(p1, p2);
        p1.sayHi();
        p2.sayHi();
    }
    public static void swap2(Person p1, Person p2){
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;

        String name  = p1.name;
        p1.name = p2.name;
        p2.name = name;
    }
}
