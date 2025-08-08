package assignment.solution.day02.user;

public class User2 {

    // Parameterized method to set values
    public void getResult(String userName, int userAge, int userRollNo) {
        // Display values
        System.out.println("Name of the User is: " + userName);
        System.out.println("Age of the User is: " + userAge);
        System.out.println("RollNo of the User is: " + userRollNo);
    }



    public static void main(String[] args) {

        User2 us = new User2();
        us.getResult("Asif",23,786);

    }
}

