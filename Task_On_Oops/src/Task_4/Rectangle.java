package Task_4;

//Rectangle class, inheriting from Shape
class Rectangle extends AreaOfShapes {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public double calculateArea() {
     return width * height;
 }
}