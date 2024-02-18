package basics;
public class IfElseStatements {
   public static void main(String []args) {
   
	int age = 12;
	char gender='F';
	
	if(age>18){
	System.out.println("Eligible");
	if(age > 60){
		System.out.println("Senior Citizen");
		
	}
	else{
	System.out.println("Normal Citizen");
	
	
	}
	
	
	}
	
	else{
	
	System.out.println(" Not Eligible");
	
	if(age < 18 && age > 16){
		System.out.println("you will be eligible soon");
	
	}
	else{
	System.out.println("too early to vote");
	
	}
	
	
	
	}

	
   
   
   
   }
   }
