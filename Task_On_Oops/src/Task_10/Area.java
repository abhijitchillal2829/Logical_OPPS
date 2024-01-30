package Task_10;

public class Area {
    // Calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;                  // pie*r^2
    } 

    // Calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }
    
    // Calculate the area of a square (specialse of a rectangle)
    public int calculateArea(int side) {
        return side * side;
    }
}
