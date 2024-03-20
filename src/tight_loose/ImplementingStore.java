package tight_loose;

public class ImplementingStore {
public static void main(String[] args) {
	
	
	Store store1 = new Store(new ItemImpl1()); //item ->ItemImpl1
	Store store2 = new Store(new ItemImpl2()); //item ->ItemImpl1
	//Store store3 = new Store();
	//Store store4 = new Store();
}
}
