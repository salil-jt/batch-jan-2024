package access_control;

public class TestStudentMarks {
public static void main(String[] args) {
	Student uday = new Student("Uday");
    
    uday.subject1 = 25;
    uday.subject2 = 35;
    uday.subject3 = 40;
    
    uday.total_marks = uday.subject1+uday.subject2+uday.subject3;
    System.out.println("total_marks: "+uday.total_marks);
    uday.total_marks = 235;
     System.out.println("total_marks: "+uday.total_marks);

}
}
class Student
{
    String name;
    int subject1;
    int subject2;
    int subject3;
    int total_marks;

    Student(String name)
    {
        this.name = name;
    }


}
