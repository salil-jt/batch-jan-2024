package access_control;

public class TestingStudentWithPrivateVariable {
public static void main(String[] args) {
	Student1 uday = new Student1("Uday");
	
	uday.setMarks(150, 200, 85);
    int result = uday.getTotalMarks();
    System.out.println("Result is : "+result);
    
  //  uday.checkSubjectMarks(); Cannot access method as it is marked private
    
	/* We cannot access these variables as we have marked them as private.
	uday.subject1 = 25;
    uday.subject2 = 35;
    uday.subject3 = 40;
    
    uday.total_marks = uday.subject1+uday.subject2+uday.subject3;
    System.out.println("total_marks: "+uday.total_marks);
    uday.total_marks = 235;
     System.out.println("total_marks: "+uday.total_marks);
     */
}
}
class Student1
{
    String name;
    private int subject1;
    private int subject2;
    private int subject3;
    private int total_marks;
    protected int result;

    Student1(String name)
    {
        this.name = name;
    }
    
    void setMarks(int subj1, int subj2,int subj3) {
    	subject1 = subj1;
    	subject2 = subj2;
    	subject3 = subj3;
    }
    
    int getTotalMarks() {
    	total_marks = subject1 + subject2 + subject3;
    	checkSubjectMarks();
    	result = 10;
    	return total_marks;
    }
    
    private void checkSubjectMarks() {
    	if(total_marks >300) {
    		total_marks=300;
    	}
    	m1();
    }
    
    private void m1() {
    	System.out.println("in m1");
    	m2();
    	
    }

    private void m2() {
    	System.out.println("in m2");
    	
    }

}
