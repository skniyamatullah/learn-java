package basics.practice;

// QUESTION>

//Create a Class called Extra which will calculate addition, subtraction, multiplication and division.
//Make sure to use Non Parameterized method with return type ?

public class Extra {

    // Addition
    public int addition() {
        int a = 10;
        int b = 5;
        return a + b;
    }

    // Subtraction
    public int subtraction() {
        int a = 10;
        int b = 5;
        return a - b;
    }

    // Multiplication
    public int multiplication() {
        int a = 10;
        int b = 5;
        return a * b;
    }

    // Division
    public int division() {
        int a = 10;
        int b = 5;
        return a / b;  // Make sure b is not zero
    }


    public static void main(String[] args) {

        //method calling through creating an object
        Extra extra = new Extra();

        System.out.println("Addition: " + extra.addition());
        System.out.println("Subtraction: " + extra.subtraction());
        System.out.println("Multiplication: " + extra.multiplication());
        System.out.println("Division: " + extra.division());
    }
}

