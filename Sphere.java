public class Sphere implements Shapes{
	
	private double radius;
	private double height;

	public Sphere(double radius) {
		this.radius = radius;
	}

	public Sphere(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double getVolume() {
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3.0);
	}

	@Override
	public double getSurfaceArea() {
		return 4 * Math.PI * radius * radius;
	}

}