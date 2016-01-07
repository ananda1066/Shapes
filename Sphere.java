public class Sphere implements Shapes{
	
	private double radius;

	public Sphere(double radius) {
		this.radius = radius;
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