package assignment.solution.day02.user;

// Question>

// Create a class called User which has 3 non-static/instance variable like name, age and id and
//   two static variables like department and salary and display their values in below output format
//   Output:
// Name of the user is: Sarju
// Age of the user is: 23
// Id of the user is: 786
// Department of the user is: CSE
// Salary of the user is: 30000

public class User {

    // NON STATIC VARIABLES
    String name = "User";
    int age = 23;
    int id = 786;

    // STATIC VARIABLES
    static String department = "CSE";
    static int salary = 30000;

    public static void main(String[] args) {
     User user = new User();

     //Calling non-static variables through object
     System.out.println("Name of the user is: " + user.name);
     System.out.println("Age of the user is: " + user.age);
     System.out.println("Id of the user is: " + user.id);

     //calling static variables directly
     System.out.println("Department of the user is: " + department);
     System.out.println("Salary of the user is: " + salary);
                              //or
     //calling static variables with ClassName
     System.out.println("Department of the user is: " + User.department);
     System.out.println("Salary of the user is: " + User.salary);
    }
}
