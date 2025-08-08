package basics.day03.operators;

public class OperatorsTest {

    public static void main(String[] args) {
        //Assignment Operator (=)
        String name = "Niyamat";

        //Arithmetic Operator

        System.out.println("Arithmetic Operator ---------------------");

        // +, -, *, /, %

        int a = 30;
        int b = 20;

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println("Addition is : " + addition);
        System.out.println("Subtraction is : " + subtraction);
        System.out.println("Multiplication is : " + multiplication);
        System.out.println("Division is : " + division);
        System.out.println("Remainder is : " + remainder);

        System.out.println("Relational Operator ---------------------");

        //Relational Operator (returns boolean value that is true or false)
         // >, <, >=, <=, !=, ==

        int firstNum = 200;
        int secondNum = 200;

        System.out.println(secondNum>firstNum);
        System.out.println(secondNum<firstNum);
        System.out.println(secondNum<=firstNum);
        System.out.println(secondNum>=firstNum);
        System.out.println(secondNum!=firstNum); //false
        System.out.println(secondNum==firstNum); //true

        //Logical Operator

        System.out.println("Logical - And Operator ---------------------");

        //AND Operator (Ampersand -- &&)
        System.out.println(10>20 && 15>20); //false false -> false
        System.out.println(10<20 && 20<=20); //true true -> true
        System.out.println(10>=10 && 10<10); //true false -> false

        System.out.println("Logical - OR Operator ---------------------");

        //OR Operator (Pipeline --- ||)
        System.out.println(10>20 || 15>20); //false false -> false
        System.out.println(10<20 || 20<=20); //true true -> true
        System.out.println(10>=10 || 10<10); //true false -> true

        System.out.println("Logical - Not Operator ---------------------");

        //Not Operator (Exclamation --- !=)
        System.out.println(10!=20); // true
        System.out.println(!(10>20)); // !(false) -> true
        System.out.println(!(20==20)); // !(true) -> false
        System.out.println(!true); //false
        System.out.println(!false); //true



    }

}
