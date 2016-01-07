public class testShapes{
	
	public static void main(String[] args){
		Cube object = new Cube(3);
		System.out.println(object.getVolume());

		RectangularPrism object2 = new RectangularPrism(2, 3, 4);
		System.out.println(object2.getVolume());

		Sphere object3 = new Sphere(3);
		System.out.println(object3.getVolume());

		Cone object4 = new Cone(3, 1);
		System.out.println(object4.getVolume());

	}



}