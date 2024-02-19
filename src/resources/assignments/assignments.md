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