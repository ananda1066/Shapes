public class Cube implements Shapes{
	
	private double side;

	public Cube(double width){
		this.side = width;
	}

	public double getVolume() {
		return Math.pow(side, 3);
	}

	public double getSurfaceArea() {
		return 6*(side * side);
	}

	public double getPerimeter() {
		return 12*side;
	}
}