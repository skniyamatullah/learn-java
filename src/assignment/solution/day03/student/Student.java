package assignment.solution.day03.student;

public class Student {

    // Non Static Method (Parameterized)

    String getName(String name) {
       return name;  }

    int getAge (int age){
        return age;   }

    int getRollNo(int rollNo) {
    return rollNo;  }

    // Static Variable

    static String getEmail = "test@email.com";
    static String getAddress = "Nuadhana,Anakhia,Jagatsinghpur";



    public static void main(String[] args) {
        Student student = new Student();

    String name = student.getName("Asif");
    System.out.println("Student name is: "+ name);

    int age = student.getAge(18);
    System.out.println("Student age is: " + age );

    int rollNumber = student.getRollNo(786);
    System.out.println("Student Role No is: " + rollNumber);

    System.out.println("Student Email is: " + getEmail);
    System.out.println("Student Address is: " + getAddress);

    }
}



