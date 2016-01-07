public class Cone extends Sphere{
	
	private double height;
	private double radius;

	public Cone(double radius, double height){
		super(radius, height);
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double getVolume(){
		return (1.0/3.0) * Math.PI * radius * radius * height;
	}

	@Override
	public double getSurfaceArea(){
		return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
	}

	public double getLateralArea(){
		return Math.PI * radius * Math.sqrt(radius * radius + height * height);
	}

}