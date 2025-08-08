package assignment.solution.day03.area;

// Calculate area of the triangle in non static method

public class TriangleArea {

    int area(int b, int h) {
        return (b * h)/2;

    }

    public static void main(String[] args) {
        TriangleArea ta = new TriangleArea();
        int area = ta.area(10, 8);
        System.out.println("Area of Triangle is: " + area);

    }
}

