package classes_objects;

public class Furniture {

	public static void main(String[] args) {
		
		
		Wood w1 = new Wood();
		w1.i=100;
		
		Wood w2 = new Wood();
		w2.i=50;
		
		System.out.println(w1.i);
		
		System.out.println(Wood.i);
		
		Wood.woodQuality();
		
		System.out.println(w2.i);
	}
	
	
}

class Wood{
	
	static int i;
	
	public static void woodQuality() {
		
		System.out.println("WoodQuality");
	}
	
}