public class Sphere implements Shapes{
	
	private double radius;

	public Sphere(double radius) {
		this.radius = radius;
	}

	public static double getVolume() {
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3.0);
	}

	public static double getSurfaceArea() {
		return 4 * Math.PI * radius * radius;
	}

}