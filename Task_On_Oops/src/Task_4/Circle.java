package Task_4;

//Circle class, inheriting from Shape
class Circle extends AreaOfShapes {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
