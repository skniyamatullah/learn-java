package basics.practice.twomethod;

public class Person {

    // Static variable
    static int age = 30;

    // Non-static variable
    String name = "John";

    public static void main(String[] args) {

        // Call static variable directly
        System.out.println("Age: " + age);

        // Create an object to call non-static variable

        Person p = new Person();
        System.out.println("Name: " + p.name);
    }
}

