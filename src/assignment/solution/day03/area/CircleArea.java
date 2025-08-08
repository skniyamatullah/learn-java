package assignment.solution.day03.area;

// Calculate area of the circle in non static method

public class CircleArea {
    public float getArea( int radius){
        return 3.1416f * radius;
    }

    public static void main(String[] args) {
 CircleArea ca = new CircleArea();
 float area = ca.getArea(5);
        System.out.println("Area of the circle is: " + area);

    }

}
