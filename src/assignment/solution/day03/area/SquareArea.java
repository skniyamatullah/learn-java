package assignment.solution.day03.area;

// Calculate area of the square in non static method

public class SquareArea {
    int calculateArea(int side){
        return side * side ;

    }

    public static void main(String[] args) {
        SquareArea sa = new SquareArea();

        int side = sa.calculateArea(4);
        System.out.println("Area of the square is: " + side);

    }
}
