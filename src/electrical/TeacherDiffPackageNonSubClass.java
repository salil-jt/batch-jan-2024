package electrical;

import access_control.Teacher;

public class TeacherDiffPackageNonSubClass {
public static void main(String[] args) {
	Teacher teacher = new Teacher();
//	teacher.id=12;//Since id is default, we cannot access it in different package non-subclass
//	teacher.section='A';
//	teacher.age=30;//Since age is private, we cannot access it in different package non-subclass
//	teacher.totalMarks=70;////Since totalMarks is protected, we cannot access it in different package non-subclass
}
}
