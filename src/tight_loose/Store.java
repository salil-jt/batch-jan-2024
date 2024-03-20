package tight_loose;

public class Store {
	private Item item;
	 
//    public Store() {
//        item = new ItemImpl1();   
//        item.price();
//    }
	public Store(Item item) {
        this.item =  item;
        item.price();
    }

}
