package ArraysAndLinkedLists;

public class z_27_constructorAndThis {
    public static class Person{
        int age;
        String name;

        Person(){
            //Default constructor
        }
        //parameterised constructor
        Person(int age, String name){
            this.age = age;
            this.name = name;
        }
        void sayHi(){
            System.out.println("Name is : "+name+", Age is : "+ age);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Satyam";
        p1.age = 18;
        p1.sayHi();

        Person p2 = new Person(25, "Shivani" );
        p2.sayHi();
    }
}
