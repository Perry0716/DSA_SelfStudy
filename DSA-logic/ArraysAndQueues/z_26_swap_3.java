package ArraysAndLinkedLists;

public class z_26_swap_3 {
    public static class Person3{
        int age;
        String name;
        void sayHi(){
            System.out.println("Name is : "+name+", Age is : "+ age);
        }
    }
    public static void main(String[] args) {
        Person3 p1 = new Person3();
        p1.name = "Satyam";
        p1.age = 18;

        Person3 p2 = new Person3();
        p2.name = "Shivani";
        p2.age = 25;

        p1.sayHi();
        p2.sayHi();
        swap2(p1, p2);
        p1.sayHi();
        p2.sayHi();
    }
    public static void swap2(Person3 prsn1, Person3 prsn2){
        prsn1 = new Person3();
        int age = prsn1.age;
        prsn1.age = prsn2.age;
        prsn2.age = age;

        prsn2 = new Person3();
        String name  = prsn1.name;
        prsn1.name = prsn2.name;
        prsn2.name = name;
    }
}
