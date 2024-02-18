package classes_objects;
class Student
{
    String name;
    int marks;
    char section;

    Student(String name)
    {
        this.name = name;
    }
    
    void setMarks(int marks){
    
    if(marks >=0 && marks <=100){
    
    	this.marks = marks;
    }
    }
    
    void setSection(char section){
    
    if(section=='A' || section=='B' || section=='C'){
    	this.section=section;
    }
    else{
    this.section='-';
    }
    
    }
    
    void setDetails(int marks, char section){
    setMarks(marks);
    setSection(section);
    
    
    }
    
    
    
}

class ClassDataValidation
{
    public static void main(String arg[])
    {
	Student s1 = new Student("Salil");
	
	s1.setDetails(35,'C');
	//s1.marks = 150; - How can we totally restrict this?
	System.out.println("S1 marks:"+s1.marks);
	System.out.println("S1 section:"+s1.section);
	


	}
}