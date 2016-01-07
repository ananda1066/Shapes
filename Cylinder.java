public class Cylinder extends Cone{
	
	private double height;
	private double radius;

	public Cylinder(double radius, double height){
		super(radius, height);
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double getVolume(){
		return Math.PI * radius * radius * height;
	}

	@Override
	public double getSurfaceArea(){
		return (2 * Math.PI * radius * height) + (2 * Math.PI * radius); 
	}

	public double getLateralArea(){
		return 2 * Math.PI * radius * height;
	}

}
