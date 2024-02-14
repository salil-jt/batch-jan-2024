class Teacher{
static int count;
int id;
int age;
Teacher(int id,int age){
this.id=id;
this.age=age;
}




void m1(){
System.out.println("In m1 method");

}
static void m2(){
System.out.println("In m2 static method");
//m1(); non-static method m1() cannot be referenced from a static context
//m3(); non-static method m1() cannot be referenced from a static context
m4();
}

void m3(){
System.out.println("In m3 method");
System.out.println("Id: "+id);
System.out.println("Age: "+age);
System.out.println("count: "+count);
}

static void m4(){
System.out.println("In m4 static method");
//System.out.println("Id: "+id); //non-static variable id cannot be referenced from a static context
//System.out.println("Age: "+age);//non-static variable id cannot be referenced from a static context
System.out.println("count: "+count);

}
}


class StaticMethodExamples {
  public static void main(String args[]) {
  
  Teacher t1 = new Teacher(10,20);
  t1.m3();
 t1.m2();
  
  } }
