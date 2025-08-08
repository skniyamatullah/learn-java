package assignment.solution.day03.area;

// Calculate area of the rectangle in non static method

public class RectangleArea {
    int calculateArea(int length,int width){
        return length * width;
    }

    public static void main(String[] args) {
        RectangleArea ra = new RectangleArea();
        int area = ra.calculateArea(10,5);
        System.out.println("Area of the Reactangle is: " + area);
    }
}
