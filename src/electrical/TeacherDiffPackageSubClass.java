package electrical;

import access_control.Teacher;

public class TeacherDiffPackageSubClass extends Teacher {

	void m2() {
		
		//id = 12;	// Since id is default, we cannot access it  in different package subclass	
		section='A';
		//age=30;// Since age is private, we cannot access it  in different package subclass 
		totalMarks=78;
	}
	
}
