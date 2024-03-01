package utilities;

import java.util.Random;

public class RandomGenerator {
public static void main(String[] args) {
	Random obj = new Random();
	System.out.println("The next Integer value : " + obj.nextInt());
	System.out.println("The next Integer  value between 0 to 4 : " + obj.nextInt(100));
}
}
