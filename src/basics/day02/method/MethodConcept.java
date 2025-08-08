package basics.day02.method;

public class MethodConcept {

    // public - access specifier/modifier

    //method syntax

    //access_specifier (public) type(static) returnType(void) methodName()
    // {  }
    //For example
//    public static void main(String[] args) {
//
//    }


    // returnType methodName()
    // {  }

    void addNumbers()
    {
      int a = 10;
      int b = 20;
      int c = a + b;
      System.out.println("Non Static Addition is: " + c);
    }

    static void addNumbers2()
    {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(" Addition is: " + c);
    }
    //static method - should accept static method and variable directly inside it

    int addNumbers3()
    {
        int a = 10;
        int b = 20;
        return a+b;
    }


    static String printFullName()
    {
        String firstName = "Sk Amir ";
        String lastName  = "Ullah";
        return firstName+lastName;
    }

    public static void sumNumbers2(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
    }

    public static void sumNumbers(){
        int a = 5 ;
        int b = 7;
        int c = 8;
        int sum = a+b+c;
        System.out.println(sum);
    }





    public static void main(String[] args) {
       // addNumbers();

        //create an object of the class

        //ClassName referenceVariable = new ClassName();

        MethodConcept methodConcept = new MethodConcept();

        methodConcept.addNumbers();

        addNumbers2();
        // or
        MethodConcept.addNumbers2();

        int additionResult  = methodConcept.addNumbers3();
        System.out.println("Int return type Addition is: " + additionResult);

        String fullName = printFullName();
        System.out.println("My full name is: " + fullName);
        int sumValue = methodConcept.addTwoNumbersParameterized(20, 30);
        System.out.println(sumValue * 10);

    }

   // Method - 2 types
    // Parameterized method

    int addTwoNumbersParameterized(int a, int b){
        return a+b;
    }


    // Non parameterized method
    void addTwoNumbers(){

    }


}
