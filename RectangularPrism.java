public class RectangularPrism implements Shapes{
	
	private double width;
	private double length;
	private double height;

	public RectangularPrism(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public static double getVolume() {
		return width * length * height;
	}

	public static double getSurfaceArea() {
		return (2*width*height) + (2*width*length) + (2*length*height);
	}

	public static double getPerimeter() {
		return 4*width + 4*length + 4*height
	}
}