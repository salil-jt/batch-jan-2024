package generics;

public class DemoWithGenerics {
	public static void main(String[] args) {

		SampleGenerics<Integer> obj1 = new SampleGenerics<Integer>(45);
		System.out.println(obj1);
		obj1.showType();
		
		SampleGenerics<String> obj2 = new SampleGenerics<String>("Salil");
		System.out.println(obj2);
		System.out.println(obj2.value.getClass().getName());
		
		
//		Object obj;
	}
}

class SampleGenerics<T> {

	T value;
	//Integer value;

	SampleGenerics(T object) {
		this.value = object;
	}

	public T getObject() {

		return value;
	}

	void showType() {
		System.out.println("Type of T is : " + value.getClass().getName());
	}
}
