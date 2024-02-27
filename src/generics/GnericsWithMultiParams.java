package generics;

public class GnericsWithMultiParams {
public static void main(String[] args) {
	TwoGenerics<Integer,String> object1 = new TwoGenerics<Integer,String>(12, "Salil");
	System.out.println(object1.ob1);
	System.out.println(object1.ob2);
	
	object1.showTypes();
	
}
}

class TwoGenerics<T, V> {
	T ob1;

	V ob2;

	TwoGenerics(T ob1, V ob2) {

		this.ob1 = ob1;

		this.ob2 = ob2;

	}

	T getOb1() {
		return ob1;
	}

	V getOb2() {
		return ob2;
	}

	void showTypes() {
		System.out.println("Type of T is : " + ob1.getClass().getName());
		System.out.println("Type of V is : " + ob2.getClass().getName());
	}
}
