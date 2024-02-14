class Student{

static int count;
int id;
int age;

Student(int id,int age){
this.id=id;
this.age=age;

}


}





class StaticExamples {
  public static void main(String args[]) {
  
   System.out.println(Student.count);
  
  
  Student s1 = new Student(10,12);

  Student s2 = new Student(12,14);
  
 System.out.println("S1 Id: "+s1.id);
 System.out.println("S2 Id: "+s2.id);
 
 s1.id = 15;
 
 System.out.println("S1 Id: "+s1.id); //15
 System.out.println("S2 Id: "+s2.id);//12
 
 
  System.out.println("S1 count: "+s1.count); //0
  System.out.println("S2 count: "+s2.count); //0
  
  //change the static variable through s1
 // s1.count  = 5;
//  System.out.println("After change: S1 count: "+s1.count); //5
  //System.out.println("After change: S2 count: "+s2.count); //5


	//Static variable
	//System.out.println("Access instance variable: "+ Student.id); --This won't work - non-static variable id cannot be referenced from a static context
	//System.out.println("Access static variable: "+ Student.count);
	
	//Print the total no of objects we created for the Student class
   System.out.println("Total objects created: "+ Student.count); 
  
  } }
