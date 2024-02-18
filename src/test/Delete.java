package test;

class Stud{

int id;
int age;
int[] marks;
char section;


Stud(int id,int age,int[] marks,char section){
this.id=id;
this.age=age;
this.marks=marks;
this.section=section;
}
Stud(int id,int age,int[] marks){
this.id=id;
this.age=age;
this.marks=marks;
this.section='E';
}


}



public class Delete {
   public static void main(String []args) {
   
   int String =0;
   System.out.println(String);
   
   int g = 3;
System.out.print(++g * 8);
   
   int[] marks={50,70,80,45};
   Stud s1 = new Stud(12,20,marks,'A');
   
   marks=new int[]{50,12,80,71};
   Stud s2 = new Stud(13,21,marks);
   
 
  Stud students[] = {s1,s2};
  System.out.println("A :: " +findStudInSection(students,'A'));
   System.out.println("B :: " +findStudInSection(students,'B'));
    System.out.println("E :: " +findStudInSection(students,'E'));
   
   
   }
   
  static int findStudInSection(Stud students[],char section){
   
   int count=0;
   for(int i=0;i<students.length;i++){
   
   if(students[i].section==section)
   count++;
   
   }
   
   
   return count;
   }
   }
