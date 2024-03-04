package assignments_programs;

public class Main {
	int count = 0;
	void A() throws Exception {
		try {
			count++;
			try {
				count++;
				try {
					count++;
					throw new Exception();
				}
				catch (Exception ex) {
					count++;
					throw new Exception();
				}
			}

			catch (Exception ex) {
				count++;
			}
		}

		catch (Exception ex) {
			count++;
		}

	}

	void display() {
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		Main obj = new Main();
		obj.A();
		obj.display();
		String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);
        String s1 = new String("Monday");
        String s2 = new String("tuesday");
        System.out.println(s1 = s2);
        String s_1 = "Today";
    //    System.out.println(s_1.charAt(s_1.toUpperCase().length()));
        String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.print(x);
		System.out.println("Java"+1000+2000+3000);  //
		 System.out.println(1000+2000+3000+"Java");  //




	}
}
