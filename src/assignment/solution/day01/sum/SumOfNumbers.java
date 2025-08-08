package assignment.solution.day01.sum;

//Question >

//Write a java program to calculate sum of 3 numbers with:
//
//a. Non parameterized method
//b. Parameterized method
//c. Directly inside main method
//d. Parameterized method with return type


public class SumOfNumbers {
    int age = 10;


    //custom method
    //B. Non parameterized method ( STATIC)
    static void sumNumbers(){
        int a = 5;
        int b = 7;
        int c = 8;
        int sum = a+b+c;
        System.out.println(sum);
    }

   // B. Parameterized method ( NON STATIC)
    void sumNumbers2(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
    }
 //  D. Parameterized method with return type >
    static int sumNumbers3(int a,int b, int c){
        return a + b + c;
    }





    //main method
    public static void main(String[] args) {

        // C. Directly inside main method
//        int a = 5;
//        int b = 7;
//        int c = 8;
//        int sum = a+b+c;
//        System.out.println("Sum of 3 numbers is: " + sum);
        sumNumbers();
        SumOfNumbers.sumNumbers();

        SumOfNumbers sn = new SumOfNumbers();

        sn.sumNumbers2(5,7,8);
        sn.sumNumbers2(15,17,18);

        System.out.printf("Age is: " + sn.age);


       int sum = sumNumbers3(10,20,30);
       System.out.println(sum);

    }
}
