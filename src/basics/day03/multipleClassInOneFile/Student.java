package basics.day03.multipleClassInOneFile;

public class Student {

    int studentId = 123;



    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student id is: " + student.studentId);
    }
}

class Employee {

    String employeeName = "Sarju";

    public static void main(String[] args) {
            Employee employee = new Employee();
            System.out.println("Employee name is: " + employee.employeeName);
            Student student = new Student();
            System.out.println("Student id inside Employee Class is: " + student.studentId);
    }
}

class Founder {

    boolean isCompanyActive = true;

    public static void main(String[] args) {
        Founder founder = new Founder();
        System.out.println("Is company active : " + founder.isCompanyActive);
        Student student = new Student();
        Employee employee = new Employee();
        System.out.println("Student id inside Founder Class is: " + student.studentId);
        System.out.println("Employee name inside Founder Class is: " + employee.employeeName);

    }
}


