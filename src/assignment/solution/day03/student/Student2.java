package assignment.solution.day03.student;

// Non Static Method with Non Parameterized

public class Student2 {

    String getName() {
        String name = "Asif";
        return name; }

    int getAge() {
        int age = 18;
        return age; }

    int getRollNo(){
        int rollNo = 786;
        return rollNo; }


    public static void main(String[] args) {
        Student2 st = new Student2();
        System.out.println("Student name is: " + st.getName());
        System.out.println("Student Age is: " + st.getAge());
        System.out.println("Student Rollno is: " + st.getRollNo());
    }

}

