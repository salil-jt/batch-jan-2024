class IceCreamPricesWithOverriding
{
    public static void main(String arg[])
    {
        IceCream ic = new IceCream();
        ic.flavor = "Pista";
        ic.numberOfScoops = 2;
        System.out.println("Total price:"+ic.getPrice());
        
        FruitSaladWithIceCream fs = new FruitSaladWithIceCream();
        fs.flavor = "Chocolate";
        fs.numberOfScoops = 1;
        fs.gramsOfFruitSalad = 50;
        System.out.println(" FruitSaladWithIceCream Total price:"+fs.getPrice());
        
        KhubaniKaMeetaWithIceCream kkm = new KhubaniKaMeetaWithIceCream();
        kkm.flavor = "Vanila";
        kkm.numberOfScoops = 1;
        kkm.gramsOfKhubaniKaMeeta = 75;
         System.out.println(" KhubaniKaMeetaWithIceCream Total price:"+kkm.getPrice());
        

    
    
}
}

class IceCream
{
    String flavor;
    int numberOfScoops;
    
    double getPrice()
    {
        double pricePerScoop = 35.0;
        return numberOfScoops * pricePerScoop;
    }
}
class FruitSaladWithIceCream extends IceCream
{
    int gramsOfFruitSalad;

    double getPrice()
    {
        double iceCreamPrice = super.getPrice(); // LINE A
        double pricePerGram = 0.75;

        return gramsOfFruitSalad * pricePerGram + iceCreamPrice;
    }
}

class KhubaniKaMeetaWithIceCream extends IceCream
{
    int gramsOfKhubaniKaMeeta;

    double getPrice()
    {
        double iceCreamPrice = super.getPrice(); // LINE B
        double pricePerGram = 1.25;
        return gramsOfKhubaniKaMeeta * pricePerGram + iceCreamPrice;
    }
}
