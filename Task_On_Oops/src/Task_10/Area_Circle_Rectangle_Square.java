package Task_10;

public class Area_Circle_Rectangle_Square {
    public static void main(String[] args) {
        Area sh = new Area();

        // Calculate and print the area of a circle
        double circleArea = sh.calculateArea(5);
        System.out.println("Area of Circle: " + circleArea);

        // Calculate and print the area of a rectangle
        double rectangleArea = sh.calculateArea(4, 6);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Calculate and print the area of a square
        int squareArea = sh.calculateArea(4);
        System.out.println("Area of Square: " + squareArea);
    }
}
