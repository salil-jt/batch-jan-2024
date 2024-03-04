### Assignment 32 (03/04)
**ArrayList,LinkedList**
1. Create a Player class with below attributes:
	* name -> String
	* age -> int
	* favoriteSports -> List<String>
2. Create atleast 3-4 Player objects
	* Sample: Player1 -> name: Salil, age:31, 	favoriteSports:["Badminton","Cricket"]
	* Sample: Player2 -> name: Ramesh, age:20, 	favoriteSports:["VolleyBall","Badminton","Kabbadi"]
	* Sample: Player3 -> name: Suresh, age:15, 	favoriteSports:["Cricket","Hockey"]
3. The program should find out how many players play Badminton In this case, it should print- No of players who play Badminton is : 2	


### Assignment 31 (03/02)
**ATM Banking Utility**
1. Create a Banking Utility which supports deposit and withdrawal. 
2. Create a BankAccount class :
	* With one private attribute called balance 
	* Whenever a new account is created set an initial balance for a user, say 1000 (balance = 1000)
	* The class should have methods for deposit ,  withdrawal and printing balance . Method signatures :
		* deposit(int amount) -> This should updated the balance
		* withdraw(int amount) ->  This should updated the balance
		* printBalance()  -> This should print the balance
3. Once we start the program, print a welcome message to the user - "Welcome to XYZ banking company" and then the below options:		
4. The main program  should keep on asking the user to select one of the following options.
	* Press 1 to check balance
	* Press 2 to deposit money
	* Press 3 to withdraw money
	* Press 4 to end the transaction
5. Depending on what the user selects, perform the operation.
	* Eg: If user selects 2, they should be given option to enter an amount and then we should update the balance.
	* If the user select anything other than 4, they should be shown the options again.
	* If the user selects 4, then end the program with a thankyou message - "Thankyou user for banking with us, let us know if you have  any feedback".
6. While depositing, make sure to handle negative values and print out updated balance after each deposit.
	* Eg 1: If the balance is 1000 and the user deposits 100 then the balance should be 1100
	* Eg 2: If the balance is 1000 and the user deposits -100 then the user should be shown a message that cannot deposit negative amount and the  balance should be remain 1000
7. While withdrawing, make sure the balance doesn't go to negative and print out updated balance after each deposit.
	* Eg 1: If the balance is 1000 and the user withdraws 100 then the balance should be 900
	* Eg 1: If the balance is 1000 and the user withdraws 1200 then the user should be shown a message that cannot withdraw, as the max balance available is less than amount to withdraw and the  balance should be remain 1000	
8. Concepts to use for this program:
	* Scanner
	* while loop
	* case statement
	* if ,else blocks
	* These are just some hints, you may use any concepts to accomplish the assignment 
9. Sample Output should be something like this when you run the program:
Welcome to XYZ banking company, 
Please select one of the following options: 
Press 1 to check balance
Press 2 to deposit money
Press 3 to withdraw money
Press 4 to end the transaction
1
The current balance in your account  is :1000
Please select one of the following options: 
Press 1 to check balance
Press 2 to deposit money
Press 3 to withdraw money
Press 4 to end the transaction
2
Enter an amount to deposit:
100
The current balance in your account  after depositing is :1100
Please select one of the following options: 
Press 1 to check balance
Press 2 to deposit money
Press 3 to withdraw money
Press 4 to end the transaction
3
Enter an amount to withdraw:
400
The current balance in your account  after withdrawing is :700
Please select one of the following options: 
Press 1 to check balance
Press 2 to deposit money
Press 3 to withdraw money
Press 4 to end the transaction
2
Enter an amount to deposit:
-100
Cannot deposit negative amount
The current balance in your account  is :700
Please select one of the following options: 
Press 1 to check balance
Press 2 to deposit money
Press 3 to withdraw money
Press 4 to end the transaction
3
Enter an amount to withdraw:
800
Cannot withdraw, as the max balance available is less than amount to withdraw
The current balance in your account  is :700
Please select one of the following options: 
Press 1 to check balance
Press 2 to deposit money
Press 3 to withdraw money
Press 4 to end the transaction
4
Thankyou for transacting with us!
Thankyou user for banking with us, let us know if you have  any feedback
	
	



### Assignment 30 (03/01)
**ArrayList**
1. Try out all the programs discussed in the class on ArrayList and its different methods
2. Create a class Student with  attributes - name,age,id,marks
	a. Create multiple objects of the Student class - atleast 5
	b. Create an Student ArrayList and add all the student objects created to this array list
	c. Now print out the names of the Students.


### Assignment 29 (03/01)
**Math class, Scanner**
1. From numbers 1 to 100, :
	* Use the Math class to get square root of all numbers
	* For even numbers, consider the ceil of the square root and for odd numbers consider the floor of square root.
	* Find out sum of the results we get in b.
	* Eg: If we have numbers 1 to 5
		* Square root of 1  : 1   		-> Since 1 is odd, consider floor -> 1
		* Square root of 2  : 1.4142	-> Since 2 is even, consider ceil -> 2
		* Square root of 3  : 1.7320	-> Since 3 is odd, consider floor -> 1
		* Square root of 4  : 2			-> Since 4 is even, consider ceil -> 2
		* Square root of 5  : 2.2360	-> Since 5 is odd, consider floor -> 2
		* Sum should be 1 + 2 + 1 + 2 + 2 = 8
2. Take a input from the user, their full name, birth year and favorite number between 2-8, separated by ,
	* For the name -> print the total no of characters.
	* For the birth year -> Find sum of all digits and print it
	* For the favorite number, find out number raised to power 3 and print it
	* Finally print sum of all the three.
	* Input-  Salil Sabnis,1992,6
	* Output :
		  noOfCharacters : 12
		  sumOfDigitsOfYear : 21
		  favoriteNumber : 216
		  Sum of all : 249
	
	


### Assignment 28 (02/29)
**Strings - Programming Questions**
1. Find Length Of Each Word In An Array. 
	* Given array String a[]= {"hello","good","morning"};
	* Output: hello -> 5 , good -> 4 , morning ->7
2. Count number of letters of each word in the below sentence
	* String input = “Good morning friends”;
	* Output : Good - 4 , morning - 7 , friends - 7
3. From the given array print words only starting with "Ro"
	* String names[] = {“Abhishek”,”Roopa”,”Rohit”,”Rishi”,”Rohan”,”Vinod”,”Ronit”,”Naresh”}
	* output: Roopa,Rohit,Rohan,Ronit
4. 	From the given array print words containing the words sh
	* String names[] = {“Abhishek”,”Roopa”,”Rohit”,”Rishi”,”Rohan”,”Vinod”,”Ronit”,”Naresh”}
	* output: Abhishek,Rishi,Naresh
5. Given a string check if it is pallindrome or not.
	* Input: madam , Output : true
	* Input: teacher , Output: false	


### Assignment 27 (02/28)
**Strings**
1. Go over the class notes and programs once of  String.
2. Find total number of letters in a String Eg: Input: "This is a program" O/p: 14
3. Count occurrence of a character in a String
	* Consider a String s = "inheritance"
	* Let's say we have to find out occurrence of 'i' in this string
	* Our program should print out 2
4. Write a Java program to reverse a String, do not use any direct methods
	* Input : Java
	* Output : avaJ



### Assignment 26 (02/27)
**Exception Handling**
1. Implement the concept of exception handling for input validation.
	 * Create a class named UserInputValidator.
	 * Implement a method named validateAge(int age) that validates the age of a user.
	 * The method should throw a checked exception InvalidAgeException if the age is less than 0 or greater than 150.
	 * It should display a nice message - "Invalid age! Age must be between 0 and 150."  when an exception is thrown
	 * From a main class, call the method validateAge(50) -> This should give output as valid age
	 * From a main class, call the method validateAge(160) -> This should throw an exception and give message - "Invalid age! Age must be between 0 and 150." 

### Assignment 25 (02/27)
**Exception Handling**
1. Go over the class notes and programs once of the Exception Handling.
2. Try out all the programs.


### Assignment 24 (02/24)
**Assignment covering concepts of inheritance,abstract classes, interfaces and access modifiers**
1. In this assignment, you will develop a Java program to model a simple school management system.
2. Create an abstract class named Person
	* This will have 3 attributes - name,age,address which will be of type String, int, String
	* name,age should be allowed to access only within that class while address can be left default.
3. Create an interface - Details
	* This will have one method - getDetails();
4. Create a class Student which is a subclass of Person and needs to implement the Details interface. In addition to this:
	* It has two more attributes studentId,grade of type int and char.
	* These should be accessible only in the Student class
	* The getDetails() method should print out the Student id, Student name and Student grade
5. Create a class Teacher which is a subclass of Person and needs to implement the Details interface. In addition to this:
	* It has three more attributes teacherId,subject,salary of type int, String,int
	* The attributes teacherId,salary should be accessible only in the Teacher class
	* The getDetails() method should print out the Teacher id, Teacher name and Teacher subject
	* Teacher class should have a method, updateGrades which takes a Student reference and a grade. When this method is called, the grade passed should be assigned to the Student grade
6. Create a main class in which:
	* Create atleast 3 student objects. At the beginning set the grade of the students to blank. (' ')
	* Create atleast 2 teacher objects.
	* Now, use the updateGrades method and use the teacher objects to set the grades of students.
	* Print the teacher details by calling the getDetails() method.
	* Print the student details by calling the getDetails() method.
	* Find out the youngest student and print the details.
	* FInd out the teacher with highest salary and print the details
	

	

### Assignment 23 (02/23)
**Access Modifiers - Assignment**
1. Create a class named Student to represent a student.
2. Include private attributes such as studentId, name, age, and grade.
3. Implement public methods to get and set these attributes.
4. Include a public method displayStudentInfo() to display student information.
5. Create a Main class with a main() method to test the student management system.
6. Create instances of the Student class.
7. Set student details using setter methods and display student information using the displayStudentInfo() method.


### Assignment 22 (02/23)
**Packages and Access Modifiers**
1. Go through the  concepts of packages and import statements
2. Go through the concepts of access modifiers, take a look at how different modifiers behave across classes, sub-classes, non-subclasses within the same package and different package.
3. Revise all what we have done till now and come up with questions if any.
4. Start using IDE and move programs over to IDE.

### Assignment 21 (02/22)
**Interfaces**
1. Try out the example of Interfaces for the class TestAccountInterface mentioned in JavaTheory_10
2. Create a program to explore interfaces by modeling a basic music player system
	* Create an interface named Playable with methods play() and stop(). These methods represent the basic functionalities of playing and stopping music.
	* Create an interface named MediaPlayer that extends Playable interface. Include additional methods with methods pause() and resume() for controlling media playback.
	* Implement the Playable interface in a class named MusicTrack
	* Implement the MediaPlayer interface in a class named SimpleMediaPlayer.
	* Add respective System.out.println() statements to the method definitions.
	* Create a main class named TestingMusicPlayerSystem and create instances of MusicTrack and SimpleMediaPlayer. Invoke methods play() and stop() and pause() and resume().
	



### Assignment 20 (02/21)
**Abstract Classes**
1. Create an abstract class Animal with methods to represent common behaviours of animals.
2. Add  makeSound() and move() abstract methods to Animal class
3. Create concrete Animal subclasses (Eg: Lion, Elephant,Snake etc) and implement those abstract methods.
4. In each implemented abstract method add a print statement of how that animal will behave
5. Test your implementation :
	* You should not be able to create objects of Animal class
	* Create instances of various animal objects and store them in an Animal reference array.
	* Invoke methods  makeSound() and move() methods of the objects created. 



### Assignment 19 (02/20)
**Inheritance - Assignment-2**
1. Write a Java program to create a class called Employee with attributes - perDaySalary and daysWorked attributes methods called work() and getSalary(). 
	* work() method prints out - "In Employee work method"
	* getSalary() method calculates salary as perDaySalary*daysWorked
2. Create a subclass of the Employee class called HRManager that overrides the work() method and getSalary() method
	* work() method prints out - "In HRManager work method"
	* getSalary() - It will add 100 Rs extra per day and then calculate salary
3. Create a subclass of the Employee class called SoftwareDeveloper that overrides the work() method  and getSalary() method
	* work() method prints out - "In SoftwareDeveloper work method"
	* getSalary() - It will add 250 Rs extra per day and then calculate salary
4.	Create 	HRManager and SoftwareDeveloper objects and call the work() method  and getSalary() method. They should invoke the methods of the child class. 
5.  Create Employee object and call the work() method  and getSalary() method. They should invoke the methods of the base class. 


### Assignment 18 (02/19)
**Inheritance - Assignment-1**
1. Define a class named Shape with a constructor that accepts a width and height value.
2. Define two sub-classes: 1) a Triangle class and 2) a Rectangle class. These 2 classes will Inherit the 2 values from the Shape class
3. The program should calculate the area of the Shapes
4. Area of a triangle is calculated as: (height * base) / 2  (base is the same as width)
5. Area of a rectangle is calculated as: height * width 
6. Create multiple triangle and rectangle objects and invoke the the getArea() Method. It should return the area accordingly.
7. Eg:
	* For an triangle with a base of 2 and a height of 5 the area would be 5. 
	* For a rectangle with a base (length) of 5 and a base of 3 the area would be 15





### Assignment 17 (02/16)
**Class Inheritance, Overiding**
1. Look at all the programs discussed in class for Inheritance
2. Practice overriding with different examples.



### Assignment 16 (02/15)
**Weekend assignment**
1. Create a class Student,
	* With age, id,marks and section attributes. Age and id are int field, marks is an array and section is a char
	* The marks attribute should hold marks of 4 subjects. 
	* Assume marks of each subject are in the range of 1 to 100 only.
	* Assume the sections the students can be will be one of - A, B, C, D, E only
	* Add constructors to the class
	* If the section attribute is not passed, set the default section to 'E'
	* Write method to return total marks of the student. When computing total marks, choose the marks of the three best subjects. Eg: If marks is {50,35,40,60} , the method should return = 50+40+60 = 150
		* Think if it will help if you create this as a class attribute
	* Write a method which returns the grade of the student based on the total marks. Grades are defined below:
		* 270 - 300 marks - Grade 'A'
		* 250 - 269 marks - Grade 'B'
		* 200 - 249 marks - Grade 'C'
		* 150 - 199 marks - Grade 'D'
		* 100 - 149 marks - Grade 'E'
		* <100	    marks - Grade 'F'
	* Create multiple student with the your choice of data.
		*  One example, age-12 , id-10 , marks - {50,35,40,60}, section - 'B'
		*  Create atleast 10-12 students and test out your program with different scenarios
	* The program should print out the following:
		* Total number of students.
		* Id with the total marks for each student.
		* The student id with highest marks. (If two or more students have the same highest marks, printing any of the student is fine)
		* The student id with lowest marks.  (If two or more students have the same lowest marks, printing any of the student is fine)
		* Print out number of students in each section. Eg: Section - A, number of students - 3 Section - B, number of students - 2 etc
			* If a section doesn't have any students, it should print 0.
			* Think how you will do this efficiently
2. 	Things to keep in mind:
	* Use proper method names, variables when creating the program.
	* Once you have a working program think of ways you can improve upon the program.

### Assignment 15 (02/15)
**Class Composition**
1. Take any real-life example and create a class structure using class composition. For example: Car has tyres, seats, wheel


### Assignment 14 (02/14)
**Recursion, Static variables,static methods and static blocks**
1. Write a recursive solution for fibonaaci series. - Practice and understand the flow
2. Call By Value, Call By Reference - revise
3. Practice Final Variable program.
4. Static variables, static methods and static blocks - Create a simple program as discussed in class.



### Assignment 13 (02/13)
**CallByValue, CallByReference,Recursion**
1. Write a recursive solution for fibonaaci series.
2. Go over the CallByValue, CallByReference examples and practice out programs.


### Assignment 12 (02/11)
**Real life problem - Employee class**
1. Create a class Employee,
	* With age, salaryPerDay and noOfWorkingDays attributes
	* A method to compute monthly salary, which will return the monthly salary which is calculated as salaryPerDay*noOfWorkingDays
	* If age is >40, add an extra bonus of 100 per working day to the monthly salary. If age is >60, add an extra bonus of 200 per working day to the monthly salary.
	* Create multiple employees with the following data. (Values are comma separated - first value is age, second is salaryPerDay, third is noOfWorkingDays)
		*  employee1 - (26, 1000, 27)
		*  employee2 - (39, 1250, 25)
		*  employee3 - (41, 1100, 29)
		*  employee4 - (53, 1050, 26)
		*  employee5 - (62, 1150, 24)
	* Print out the monthly salary for each employee and find out the employee with maximum salary.


### Assignment 11 (02/10)
**Class and Objects - Create Calculator class**
1. Practice creating classes , multiple objects, constructors (default and parameterized)
2. Create a Calculator class which performs addition, multiplication and division. From the CalculatorDemo.java file, create objects and perform operations.
	1. The multiply method should take 2 int parameters and return an int
	2. The multiply method should take 3 int parameters and return an int
	3. The divide method should take 2  double  parameters and return an double
	4. The subtract method should take 2 int parameters and return an int


### Assignment 10 (02/09)
**Class and Objects**
1. Practice creating classes , multiple objects, methods (with no return and with return, with params, without params)
2. Assignment on Classes and objects
	1. Create a Student class with age, birthYear and noOfFriends.
	2. Create atleast 5 student objects.
	3. Print sum of all noOfFriends.
	4. In the class, create a method which prints the age group of the student depending on age. Eg: For age, 1-12 => print kid, 13 -> 19 => print teen , 20 - 45 => print adult, above 45 => print senior
	5. In the class, create a method which returns the sum of the digits of the birthYear
	


### Assignment 9 (02/08)
**Classes and Objects**
1. Go through the theory doc and understand the basic concepts of OOPs
2. Go through the basics of class/objects.
3. Create a class and two objects of that class.

### Assignment 8 (02/07)
**Programs**
1. Write a program to find if a number is a spy number
	* A number is defined as a spy number if the sum of its individual digits = product of its individual digits.
	* Eg: 123 is a spy number because sum and product of individual digits is same => 1+2+3 = 6 , 1*2*3 = 6
	* Eg: 324 is not a spy number because sum and product of individual digits is not same => 3+2+4 = 9 , 3*2*4 = 24
2. Write a program to find if a number is a pallindrome number
	* A number is defined as a pallindrome number if the number = reverse of the number
	* Eg: 121 is a pallindrome number because number and reverse of a number both are same => 121 = 121 (in reverse)
	* Eg: 123 is not a pallindrome number because number and reverse of a number both are not same => 123 != 321 (in reverse)
	


### Assignment 8 (02/06)
**Programs**
1. Write a program to add two matrices and store the result in a new matrix.
2. Try out various versions of the prime number program.
	* Using a variable (count)
	* Using a variable (count) and break
	* using a count and a flag + break
	* using only flag and break
3. Coding Standard
	* Class Naming - use camel case notations
	* Create separate files for different programs
	



### Assignment 7 (02/05)
**Arrays In Java, Try few programs**
1. Go through the arrays lecture, notes and programs.
2. Write a program to check if two arrays are equal or not. Eg 1: array1  = {2,3,4,5} , array2 = {2,3,4,5} , output should be true. Eg 2: array1  = {2,3,4,6} , array2 = {2,3,4,5} , output should be false.
3. Write a program to find the sum of numbers at even and odd indices in array and then print out the which sum is the greatest.
	* Eg: array = {4,5,2,8,3,6}
	* Sum at even indices = 4+2+3 = 9 (4 is at index 0, 2 is at index 2, 3 is at index 4)
	* Sum at odd  indices = 5+8+6 = 19 (5 is at index 1, 8 is at index 3, 6 is at index 5)
	* O/p should be: Sum at odd indices is greatest.
4. Find maximum and minimum in an array	.Eg: array = {4,5,2,8,3,6} , output: Max: 8 , Min:2

### Assignment 6 (02/05)
**Common Programs asked during interviews**
1. Find out all prime numbers between 1-100.
2. Print the Fibonaaci series using Java upto a given number.

### Assignment 5 (02/02)
**Iteration Statements - for, while, do while**
1. Go through all the Iteration Statements discussed in the class
2. Write a program to calculate factorial of a number using while loop.
3. Write a program to print only the even numbers from 1 to 100.



### Assignment 4 (02/01)
**Control Statement in Java**
1. Practice if else statements
2. Practice switch statements. Execute the programs in the  document shared.
3. Iteration statements - for, while

### Assignment 3 (01/31)
**Operators in Java**
1. Practice Short circuit operators
2. Practice Ternary operator
3. Evaluate a few expressions using operator precedence

### Assignment 2 (01/30)
**Creating Git repo and Java Installation**
1. Practice Arithmetic Operators (mostly focus on increment and decrement operators)
2. Practice BitWise Operators (&,|,^,<<,>>)
3. Revise 2's complement


### Assignment 1 (01/29)
**Creating Git repo and Java Installation**
1. Create a GitHub account
2. Create a GitHub repository
3. Install any IDE (Eclipse, STS or IntelliJ)
4. Practice basic Hello World Program
5. Practice data types
