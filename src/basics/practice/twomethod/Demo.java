package basics.practice.twomethod;

public class Demo {
    // Static Method
    static void firstMethod(){

        System.out.println("I Am Static Method");
    }
    //Non Static Method

    void secondMethod(){
        System.out.println("I Am Non Static Method");
    }


    public static void main(String[] args) {
        //Calling Static Method (No Object Required)
        //firstMethod();
        Demo.firstMethod();


        // Calling Non Static Method ( Creating an Object)
        // Syntax or Formula
        // ClassName ReferenceVariable = new ClassName();
        //Reference Variable.methodName();

        Demo demo = new Demo();
        demo.secondMethod();
    }
}
