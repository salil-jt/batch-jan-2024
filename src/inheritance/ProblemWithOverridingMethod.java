package inheritance;

class Furniture{

	void paint() {
		
		System.out.println("In paint of furniture");
	}
	
	final void useWood() {
		
		System.out.println("Use only sandalwood");
	}
	//When we want to restrict or force that the sub class should not override the parent class method, we should use final keyword for the method


	
}
class Table extends Furniture{
	
	@Override //Annotation
	void paint() {
		
		System.out.println("In paint of Table");
	}
	/* This will give error
void useWood() {
		
		System.out.println("Use cheap wood");
	}
	*/
	
	

}






public class ProblemWithOverridingMethod {
public static void main(String[] args) {
	Table t  = new Table();
	t.paint();
	t.useWood();
}
}
