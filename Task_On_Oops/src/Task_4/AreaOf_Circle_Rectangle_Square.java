package Task_4;

public class AreaOf_Circle_Rectangle_Square {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 8);
        Square square = new Square(5);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
    }
}