public class Cube extends RectangularPrism{
	
	private double side;

	public Cube(double width){
		super(width);
		this.side = width;
	}

	@Override
	public double getVolume() {
		return Math.pow(side, 3);
	}

	@Override
	public double getSurfaceArea() {
		return 6*(side * side);
	}

	@Override
	public double getPerimeter() {
		return 12*side;
	}
}