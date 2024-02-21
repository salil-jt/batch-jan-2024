package inheritance;

public class IceCreamPricesWithConstructors {

	public static void main(String[] args) {
		
		IceCreamS ic = new IceCreamS("Vanilla", 2);
		System.out.println(ic.getPrice());
		
		FruitSaladWithIceCreamS fic = new FruitSaladWithIceCreamS("FruitSalad", 2, 20);
		System.out.println(fic.getPrice());
		
	}
}
class IceCreamS
{
    String flavor;
    int numberOfScoops;
    
    IceCreamS(String flavor, int numberOfScoops)
    {
        this.flavor = flavor;
        this.numberOfScoops = numberOfScoops;
    }
    
    double getPrice()
    {
        double pricePerScoop = 35.0;
        return numberOfScoops * pricePerScoop;
    }
    
    /*Either Add this or Line no 43.
     * public IceCreamS() {
     */
		// TODO Auto-generated constructor stub
	//}
	
    
   
}


class FruitSaladWithIceCreamS extends IceCreamS
{
    int gramsOfFruitSalad;

    FruitSaladWithIceCreamS(String flavor, int numberOfScoops, int gramsOfFruitSalad)
    {
    	super(flavor,numberOfScoops); //This is needed because, in Inheritance if we are using a parameterized
    	//constructor in the Parent class and then we extend that class, in the sub class Java needs us to define either a default constructor of the parent class or use the parameterized one.
    	//It gives 2 options - either create a default constructor in parent class or add super to the parameterized constructor of the sub class
        this.gramsOfFruitSalad = gramsOfFruitSalad; // LINE B
    }

    double getPrice()
    {
        double iceCreamPrice = super.getPrice(); 
        double pricePerGram = 0.75;

        return gramsOfFruitSalad * pricePerGram + iceCreamPrice;
    }
}


