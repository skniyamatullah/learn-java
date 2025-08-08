package assignment.solution.day02.calculator;

//Question>

//Create a Calculator which will calculate addition, subtraction, multiplication and division.

//Make sure to use
//Parameterized method with return type ?

public class Calculator {

    // Addition
    public int add (int a , int b){
        return a + b;
    }

    // Subtraction

    public int subtract (int a, int b){
        return a - b;
    }

    //Multiplication

    public int multiplication (int a, int b){
        return a * b;
    }

    //Division

    public int division (int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println("Addition is: " + cal.add(30,6));
        System.out.println("Subtraction is: " + cal.subtract(30,6));
        System.out.println("Multiplication is: " + cal.multiplication(30,6));
        System.out.println("Division is: " +  cal.division(30,6));
    }

    //What could have been done better
    // variable name should be meaningful, firstNum and secondNum
}
