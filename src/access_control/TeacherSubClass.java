package access_control;

public class TeacherSubClass extends Teacher {

	void test_m1() {
		
		id = 12;		
		section='A';
		//age=30; Since age is private, we cannot access it even in same package subclass
		totalMarks=78;
		
	}
	
}
