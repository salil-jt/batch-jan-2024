package access_control;

public class TeacherTest {
public static void main(String[] args) {
	Teacher teacher = new Teacher();
	teacher.id=12;
	teacher.section='A';
	//teacher.age=30;//Since age is private, we cannot access it even in same package non subclass
	teacher.totalMarks=70;
}
}
