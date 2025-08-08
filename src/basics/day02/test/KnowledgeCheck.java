package basics.day02.test;

public class KnowledgeCheck {

    // Variables

   // access_specifier type dataType variableName = value
    // public static int studentId = 123;

    //dataType variableName = value
    // For example:
    //int studentId = 123;

    //Local Variable - any variable inside a method
    //Instance Variable / Class Variable // Global Variable


    int studentId = 123;
    int studentAge = 21;
    int studentRegdNo = 1301333099;

    void printStudentDetails(){
        System.out.println("Printing student details ....");
    }

    public static void main(String[] args) {
        KnowledgeCheck knowledgeCheck = new KnowledgeCheck();
        System.out.println("Student id is: " + knowledgeCheck.studentId); //error
        System.out.println("Student age is: " + knowledgeCheck.studentAge);
        System.out.println("Student RegdNo is: " + knowledgeCheck.studentRegdNo);
        knowledgeCheck.printStudentDetails();
    }



    // To access any non static variables and non static methods, we will have to
    // create the object of the class inside main method
}
